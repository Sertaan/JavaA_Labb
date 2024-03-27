# Ta bort tabellen "players"
DROP TABLE players;


# Skapar tabellen "players"
CREATE TABLE players (
    id            VARCHAR(36) NOT NULL PRIMARY KEY,
    first_name    VARCHAR(100) NOT NULL,
    last_name     VARCHAR(100) NOT NULL,
    age           VARCHAR(100) NOT NULL,
    country       INT NOT NULL
);

# Uppdatera med en ny column
ALTER TABLE players ADD COLUMN age VARCHAR(10) NOT NULL;

# Lägg till en ny användare
INSERT INTO players (id, first_name, last_name, age) VALUES ('2', 'Sertan', 'Keskin', '29');
INSERT INTO players (id, first_name, last_name, age) VALUES ('3', 'Gunnar', 'Keskin', '29');
INSERT INTO players (id, first_name, last_name, age) VALUES ('4', 'Rebecka', 'Keskin', '29');
INSERT INTO players (id, first_name, last_name, age) VALUES ('5', 'Daniel', 'Keskin', '29');
INSERT INTO players (id, first_name, last_name, age) VALUES ('6', 'Susanne', 'Keskin', '29');

# Uppdatera specifik kolumn för en specifik användare i tabellen
UPDATE players SET first_name = 'Sertan' WHERE id = '2';

# Lista allt från en tabell
SELECT * FROM players;

# Lista förnamn allt från en tabell
SELECT first_name FROM players;

# Lista alla med ett specifikt värde
SELECT * FROM players WHERE country = 'Sverige';

# Lista alla med ett större än värde
SELECT * FROM players WHERE age > 30;

# Lista alla med ett som uppfyller flera villkor
SELECT * FROM players WHERE age > 65 AND country = 'USA';



