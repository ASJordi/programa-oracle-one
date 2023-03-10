SELECT f_cliente_aleatorio() AS CLIENTE, 
f_producto_aleatorio() AS PRODUCTO,
f_vendedor_aleatorio() AS VENDEDOR;

SELECT MAX(NUMERO) FROM facturas;

SELECT COUNT(*) FROM facturas;

SELECT NUMERO FROM FACTURAS ORDER BY NUMERO DESC LIMIT 88000;

DROP TABLE items;
DROP TABLE facturas;

CREATE TABLE facturas(
NUMERO INT NOT NULL,
FECHA DATE,
DNI VARCHAR(11) NOT NULL,
MATRICULA VARCHAR(5) NOT NULL,
IMPUESTO FLOAT,
PRIMARY KEY (NUMERO),
FOREIGN KEY (DNI) REFERENCES clientes(DNI),
FOREIGN KEY (MATRICULA) REFERENCES vendedores(MATRICULA)
);

CREATE TABLE items(
NUMERO INT NOT NULL,
CODIGO VARCHAR(10) NOT NULL,
CANTIDAD INT,
PRECIO FLOAT,
PRIMARY KEY (NUMERO, CODIGO),
FOREIGN KEY (NUMERO) REFERENCES facturas(NUMERO),
FOREIGN KEY (CODIGO) REFERENCES productos(CODIGO)
);

INSERT INTO facturas
SELECT NUMERO, FECHA_VENTA AS FECHA, DNI, MATRICULA, IMPUESTO
FROM jugos_ventas.facturas;

INSERT INTO items
SELECT NUMERO, CODIGO_DEL_PRODUCTO AS CODIGO, CANTIDAD, PRECIO
FROM jugos_ventas.items_facturas;

DELIMITER $$
CREATE PROCEDURE `sp_venta`(fecha DATE, maxitems INT, maxcantidad INT)
BEGIN
DECLARE vcliente VARCHAR(11);
DECLARE vproducto VARCHAR(10);
DECLARE vvendedor VARCHAR(5);
DECLARE vcantidad INT;
DECLARE vprecio FLOAT;
DECLARE vitens INT;
DECLARE vnfactura INT;
DECLARE vcontador INT DEFAULT 1;
DECLARE vnumitems INT;
SELECT MAX(NUMERO) + 1 INTO vnfactura FROM facturas;
SET vcliente = f_cliente_aleatorio();
SET vvendedor = f_vendedor_aleatorio();
INSERT INTO facturas (NUMERO, FECHA, DNI, MATRICULA, IMPUESTO) VALUES (vnfactura, fecha, vcliente, vvendedor, 0.16);
SET vitens = f_aleatorio(1,  maxitems);
WHILE vcontador <= vitens
DO
SET vproducto = f_producto_aleatorio();
SELECT COUNT(*) INTO vnumitems FROM items
WHERE CODIGO = vproducto AND NUMERO = vnfactura;
IF vnumitems = 0 THEN
  SET vcantidad = f_aleatorio(1, maxcantidad);
  SELECT PRECIO INTO vprecio FROM productos WHERE CODIGO = vproducto;
  INSERT INTO items(NUMERO, CODIGO, CANTIDAD, PRECIO) VALUES(vnfactura, vproducto, vcantidad, vprecio);
END IF;
SET vcontador = vcontador+1;
END WHILE;
END $$

CALL sp_venta('20210619', 3, 100);
