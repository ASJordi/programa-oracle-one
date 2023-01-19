CREATE DATABASE control_stock;
USE control_stock;

CREATE TABLE categoria
(
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(60)
)ENGINE=InnoDB;

CREATE TABLE producto
(
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(255),
cantidad INT NOT NULL DEFAULT 0,
categoria_id INT NOT NULL, 
FOREIGN KEY (categoria_id) REFERENCES categoria(id)
)ENGINE=InnoDB;

INSERT INTO categoria (nombre) VALUES ("Tecnologia"), ("Hogar"), ("Electronica");

INSERT INTO producto (nombre, descripcion, cantidad, categoria_id) 
VALUES ("Mesa", "Mesa de 4 lugares", 10, 2), ("Celular", "Celular Samsung", 50, 1);

SELECT * FROM producto;