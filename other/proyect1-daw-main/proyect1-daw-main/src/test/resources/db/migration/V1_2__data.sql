-- V1_2__data.sql

INSERT INTO publisher (name) VALUES
                                 ('Editorial Anagrama'),
                                 ('Penguin Random House Grupo Editorial España'),
                                 ('Editorial Planeta, S. A.');

INSERT INTO books (isbn, title, synopsis, id_publisher, price, cover) VALUES
                                                                          ('9788433920423', 'La conjura de los necios', 'El protagonista de esta novela es ...', 1, 13.20, 'necios.jpeg'),
                                                                          ('9788426418197', 'El nombre de la rosa', 'Valiéndose de las características de la novela gótica...', 2, 12.30, 'nombreRosa.jpeg'),
                                                                          ('9786074213485', 'La insorportable levedad del ser', 'La insoportable levedad del ser es una novela...', 3, 18.05, 'levedad.jpeg')

