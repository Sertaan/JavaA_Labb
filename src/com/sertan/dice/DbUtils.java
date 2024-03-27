package com.sertan.dice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbUtils {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost:3306/dice";

    //  Database credentials
    static final String USERNAME = "user";
    static final String PASSWORD = "password";

    private static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to a selected database...");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected database successfully...");

        } catch (SQLException | ClassNotFoundException sqlException) {
            System.out.println(sqlException.getMessage());
        }

        return connection;
    }

    public static List<Player> getPlayers() {
        String sqlQuery = "SELECT * FROM players";
        Connection connection = getConnection();

        if (connection == null) {
            throw new RuntimeException("Unable to establish connection to the database.");

        }
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            return toPlayers(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Player> toPlayers(ResultSet resultSet) {
        List<Player> players = new ArrayList<Player>();

        try {
            while(resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getString("id"));
                player.setName(resultSet.getString("name"));
                player.setTotalRolls(resultSet.getInt("total_rolls"));
                player.setTotalPoints(resultSet.getInt("total_points"));
                players.add(player);
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }

        return players;
    }
}
