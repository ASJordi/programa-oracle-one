DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `hola_mundo`()
BEGIN
SELECT "Hola Mundo!!!!";
END$$
DELIMITER ;

-- CALL hola_mundo;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `muestra_numero`()
BEGIN
SELECT(9+5)*2 AS RESULTADO;
END$$
DELIMITER ;

-- CALL muestra_numero;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `concatenar`()
BEGIN
SELECT CONCAT('Hola Mundo', " ", '!!!!') AS RESULTADO;
END$$
DELIMITER ;

CALL concatenar;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `concatenar_con_comentarios`()
BEGIN
/*
Este es un ejemplo de comentario
al interior de un procedire
*/
-- Así se comenta un stored procedure.
# Así también.
SELECT CONCAT("Hola a todos!!", ' ', 'Este procedure concatena strings.') AS RESULTADO;
END$$
DELIMITER ;

-- CALL concatenar_con_comentarios;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `concatenar2`()
BEGIN
SELECT CONCAT('Hola Mundo', " ", '!!!!') AS RESULTADO;
END$$
DELIMITER ;

-- CALL concatenar2;