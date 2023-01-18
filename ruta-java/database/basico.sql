CREATE DATABASE jugos CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

USE jugos;

CREATE TABLE tbclientes
(
dni VARCHAR(20),
nombre VARCHAR(150),
direccion1 VARCHAR(150),
direccion2 VARCHAR(150),
barrio VARCHAR(50),
ciudad VARCHAR(50),
estado VARCHAR(50),
cp VARCHAR(10),
edad SMALLINT,
sexo VARCHAR(1),
limite_credito FLOAT,
volumen_compra FLOAT,
primera_compra BIT(1)
);

-- DROP TABLE tbclientes;

CREATE TABLE tbproductos
(
producto VARCHAR (20) ,
nombre VARCHAR (150) ,
envase VARCHAR (50) ,
volumen VARCHAR (50) ,
sabor VARCHAR (50) ,
precio FLOAT
);

INSERT INTO tbproductos
(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('773912', 'clean', 'botella pet',
'1 litro', 'naranja', 8.01
);

INSERT INTO tbproductos
(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('838819', 'clean', 'botella pet',
'1.5 litros', 'naranja', 12.01
);

INSERT INTO tbproductos
(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('1037797', 'clean', 'botella pet',
'2 litros', 'naranja', 16.01
);

INSERT INTO tbproductos
(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('8128292', 'clean', 'latat',
'350 ml', 'naranja', 2.81
);

INSERT INTO tbproductos
(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('695594', 'Festival de Sabores', 'Botella PET',
'1.5 Litros', 'Asaí', 18.51
);

INSERT INTO tbproductos
(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('1041119', 'Línea Citrus', 'Botella de Vidrio',
'700 ml', 'Lima', 4.90
);

SELECT * FROM tbproductos;

UPDATE tbproductos SET producto = '812829', envase = 'lata'
WHERE volumen = '350 ml';

UPDATE tbproductos SET precio = 28.51
WHERE producto = '695594';

UPDATE tbproductos SET sabor = 'Lima/Limón', precio = 4.90
WHERE producto = '1041119';

SELECT * FROM tbproductos;

DELETE FROM tbproductos WHERE producto = '773912';

INSERT INTO tbproductos(
producto, nombre, envase, volumen, sabor,
precio) VALUES ('773912', 'clean', 'botella pet',
'1 litro', 'naranja', 8.01);

SELECT * FROM tbproductos;

ALTER TABLE tbproductos ADD PRIMARY KEY(PRODUCTO);

ALTER TABLE tbclientes ADD PRIMARY KEY (DNI);

ALTER TABLE tbclientes ADD COLUMN(FECHA_NACIMIENTO DATE);

INSERT INTO tbclientes(
DNI,
NOMBRE,
DIRECCION1, 
DIRECCION2, 
BARRIO,
CIUDAD,
ESTADO,
CP,
EDAD,
SEXO, 
LIMITE_CREDITO,
VOLUMEN_COMPRA, 
PRIMERA_COMPRA,
FECHA_NACIMIENTO) VALUES(
'456879548', 'Pedro el Escamoso', 'Calle del Sol, 25', '', 'Los Laureles', 'CDMX', 'México', '65784', 55, 'M',
1000000, 2000, 0, '1971-05-25');

SELECT * FROM tbclientes;