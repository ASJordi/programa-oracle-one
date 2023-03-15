CREATE USER 'admingeneric01'@'%' IDENTIFIED BY 'admingeneric01';

GRANT ALL PRIVILEGES ON *.* TO 'admingeneric01'@'%' WITH GRANT OPTION;

CREATE USER 'user04'@'%' IDENTIFIED BY 'user04';

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE TEMPORARY TABLES,
LOCK TABLES, EXECUTE ON jugos_ventas.* TO 'user04'@'%';

CREATE USER 'user05'@'%' IDENTIFIED BY 'user05';

GRANT SELECT, INSERT, UPDATE, DELETE ON jugos_ventas.facturas TO 'user05'@'%';

GRANT SELECT ON jugos_ventas.tabla_de_vendedores TO 'user05'@'%';

SELECT * FROM mysql.user;

SHOW GRANTS FOR 'user02'@'localhost';

REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'user02'@'localhost';