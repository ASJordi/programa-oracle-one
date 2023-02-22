/* FUNCIONES STRING */

SELECT LTRIM("    MySQL es fácil");

SELECT RTRIM("MySQL es fácil    ");

SELECT TRIM("    MySQL es fácil    ");

SELECT CONCAT("MySQL es fácil,", " no lo crees?");

SELECT UPPER("mysql es una base de datos interesante.");

SELECT LOWER("MYSQL ES UNA BASE DE DATOS INTERESANTE.");

SELECT SUBSTRING("mysql es una base de datos interesante.", 14,4);

SELECT CONCAT(NOMBRE, " ", DNI) FROM tabla_de_clientes;

/* FUNCIONES DATE */

SELECT CURDATE();

SELECT current_timestamp();

SELECT YEAR(current_timestamp());

SELECT MONTH(current_timestamp());

SELECT DAY(current_timestamp());

SELECT MONTHNAME(current_timestamp());

SELECT DAYNAME(current_timestamp());

SELECT DATEDIFF(current_timestamp(), "2021-01-01") AS DIFERENCIA_DE_DIAS;

SELECT DATEDIFF(current_timestamp(), "1984-06-20") AS DIFERENCIA_DE_DIAS;

SELECT current_timestamp() AS DIA_HOY, 
DATE_SUB(current_timestamp(), INTERVAL 1 MONTH) AS RESULTADO;

SELECT DISTINCT FECHA_VENTA,
DAYNAME(FECHA_VENTA) AS DIA, MONTHNAME(FECHA_VENTA) AS MES, 
YEAR(FECHA_VENTA) AS AÑO FROM facturas;

/* FUNCIONES MATEMÁTICAS */

SELECT (34+346-67)/15 * 29 AS RESULTADO;

SELECT CEILING (23.1222);

SELECT FLOOR (23.999999);

SELECT RAND() AS RESULTADO;

SELECT ROUND(254.545,2);

SELECT ROUND(254.545,1);

SELECT NUMERO, CANTIDAD, PRECIO, 
CANTIDAD * PRECIO AS FACTURACIÓN FROM items_facturas;

SELECT NUMERO, CANTIDAD, PRECIO, 
ROUND(CANTIDAD * PRECIO,2) AS FACTURACIÓN FROM items_facturas;

/* FUNCIONES CONVERSIÓN */

SELECT CURRENT_TIMESTAMP() AS RESULTADO;

SELECT CONCAT("La fecha y la hora de hoy son: ", CURRENT_TIMESTAMP()) AS RESULTADO;

SELECT CONCAT("La fecha y el horario son: ",
DATE_FORMAT(CURRENT_TIMESTAMP(),"%W, %d/%m/%Y a las %T" )) AS RESULTADO;

SELECT CONVERT(23.45, CHAR) AS RESULTADO;

SELECT SUBSTRING(CONVERT(23.45, CHAR),3,1) AS RESULTADO;