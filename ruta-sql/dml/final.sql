/*PROYECTO FINAL*/

CREATE TABLE tb_identificacion(
ID INT AUTO_INCREMENT NOT NULL,
DESCRIPCION VARCHAR(50) NULL,
PRIMARY KEY(ID)
);

SELECT * FROM tb_identificacion;

INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente A');
INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente B');
INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente C');
INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente D');
INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente E');

DELETE FROM tb_identificacion WHERE ID= 6;

INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente G');
INSERT INTO tb_identificacion(ID, DESCRIPCION)
VALUES (100, 'Cliente G');
INSERT INTO tb_identificacion(DESCRIPCION)
VALUES ('Cliente H');
INSERT INTO tb_identificacion(ID, DESCRIPCION)
VALUES (NULL, 'Cliente I');

CREATE TABLE tb_default(
ID INT AUTO_INCREMENT,
DESCRIPCION VARCHAR(50) NOT NULL,
DIRECCION VARCHAR(100) NULL,
CIUDAD VARCHAR(50) DEFAULT 'Monterrey',
FECHA_CREACION TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
PRIMARY KEY(ID)
);

INSERT INTO tb_default 
(DESCRIPCION, DIRECCION, CIUDAD, FECHA_CREACION)
VALUES ('Cliente X', 'Calle Sol, 525', 'Cancún', '2021-01-01');

SELECT * FROM tb_default;

INSERT INTO tb_default 
(DESCRIPCION)
VALUES ('Cliente Y');

CREATE TABLE tb_facturacion(
FECHA DATE NULL,
VENTA_TOTAL FLOAT
);

SELECT * FROM tb_facturacion;

CREATE TABLE `tb_items_facturas1` (
  `NUMERO` varchar(5) NOT NULL,
  `CODIGO` varchar(10) NOT NULL,
  `CANTIDAD` int DEFAULT NULL,
  `PRECIO` float DEFAULT NULL,
  PRIMARY KEY (`NUMERO`,`CODIGO`),
  KEY `FK_PRODUCTO1` (`CODIGO`),
  CONSTRAINT `FK_FACTURA1` FOREIGN KEY (`NUMERO`) REFERENCES `tb_factura` (`NUMERO`),
  CONSTRAINT `FK_PRODUCTO1` FOREIGN KEY (`CODIGO`) REFERENCES `tb_producto` (`CODIGO`)
) ;

SELECT * FROM tb_items_facturas1;
SELECT * FROM tb_factura1;
SELECT * FROM tb_cliente;
SELECT * FROM tb_vendedor;
SELECT * FROM tb_producto;

INSERT INTO tb_factura1 
VALUES('0100', '2021-01-01', '1471156710', '235', 0.10 );
INSERT INTO tb_items_facturas1
VALUES('0100', '1002767', 100, 25),
('0100', '1004327', 200, 25),
('0100', '1013793', 300, 25);

SELECT A.FECHA, SUM(B.CANTIDAD * B.PRECIO) AS VENTA_TOTAL
FROM tb_factura1 A
INNER JOIN
tb_items_facturas1 B
ON A.NUMERO = B.NUMERO
GROUP BY A.FECHA;

INSERT INTO tb_factura1 
VALUES('0101', '2021-01-01', '1471156710', '235', 0.10 );
INSERT INTO tb_items_facturas1
VALUES('0101', '1002767', 100, 25),
('0101', '1004327', 200, 25),
('0101', '1013793', 300, 25);

INSERT INTO tb_factura1 
VALUES('0102', '2021-01-01', '1471156710', '235', 0.10 );
INSERT INTO tb_items_facturas1
VALUES('0102', '1002767', 200, 25),
('0102', '1004327', 300, 25),
('0102', '1013793', 400, 25);


DELIMITER //
CREATE TRIGGER TG_FACTURACION_INSERT 
AFTER INSERT ON tb_items_facturas1
FOR EACH ROW BEGIN
  DELETE FROM tb_facturacion;
  INSERT INTO tb_facturacion
  SELECT A.FECHA, SUM(B.CANTIDAD * B.PRECIO) AS VENTA_TOTAL
  FROM tb_factura1 A
  INNER JOIN
  tb_items_facturas1 B
  ON A.NUMERO = B.NUMERO
  GROUP BY A.FECHA;
END //

INSERT INTO tb_factura1 
VALUES('0103', '2021-01-01', '1471156710', '235', 0.10 );
INSERT INTO tb_items_facturas1
VALUES('0103', '1002767', 200, 25),
('0103', '1004327', 300, 25),
('0103', '1013793', 400, 25);

SELECT * FROM tb_facturacion;

INSERT INTO tb_factura1 
VALUES('0104', '2021-01-01', '1471156710', '235', 0.10 );
INSERT INTO tb_items_facturas1
VALUES('0104', '1002767', 200, 25),
('0104', '1004327', 400, 30),
('0104', '1013793', 500, 25);

SELECT * FROM tb_facturacion;
SELECT * FROM tb_factura1;
SELECT * FROM tb_items_facturas1;

UPDATE tb_items_facturas1 SET CANTIDAD = 600
WHERE NUMERO = '0101' AND CODIGO = '1002767';

DELETE FROM tb_items_facturas1
WHERE NUMERO = '0104' AND CODIGO = '1004327';

DELIMITER //
CREATE TRIGGER TG_FACTURACION_DELETE
AFTER DELETE ON tb_items_facturas1
FOR EACH ROW BEGIN
  DELETE FROM tb_facturacion;
  INSERT INTO tb_facturacion
  SELECT A.FECHA, SUM(B.CANTIDAD * B.PRECIO) AS VENTA_TOTAL
  FROM tb_factura1 A
  INNER JOIN
  tb_items_facturas1 B
  ON A.NUMERO = B.NUMERO
  GROUP BY A.FECHA;
END //

DELIMITER //
CREATE TRIGGER TG_FACTURACION_UPDATE
AFTER UPDATE ON tb_items_facturas1
FOR EACH ROW BEGIN
  DELETE FROM tb_facturacion;
  INSERT INTO tb_facturacion
  SELECT A.FECHA, SUM(B.CANTIDAD * B.PRECIO) AS VENTA_TOTAL
  FROM tb_factura1 A
  INNER JOIN
  tb_items_facturas1 B
  ON A.NUMERO = B.NUMERO
  GROUP BY A.FECHA;
END //

UPDATE tb_items_facturas1 SET CANTIDAD = 800
WHERE NUMERO = '0101' AND CODIGO = '1002767';

DELETE FROM tb_items_facturas1
WHERE NUMERO = '0104' AND CODIGO = '1013793';