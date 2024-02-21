-- V1_1__schema.sql

CREATE TABLE publisher (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           name VARCHAR(255) NOT NULL
);

CREATE TABLE books (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       isbn VARCHAR(13) UNIQUE NOT NULL,
                       title VARCHAR(255) NOT NULL,
                       synopsis TEXT,
                       id_publisher INT,
                       price DECIMAL(10, 2) NOT NULL,
                       cover VARCHAR(255),
                       FOREIGN KEY (id_publisher) REFERENCES publisher(id)
);