CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);


INSERT INTO users (username, password, email)
VALUES ('bhumika', 'password123', 'bhumikak.cs22@rvce.edu.in'),
       ('deepthi', 'password456', 'deepthi.cv22@rvce.edu.in');