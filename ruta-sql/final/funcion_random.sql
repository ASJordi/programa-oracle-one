-- MIN = 20 Y MAX = 250
-- (RAND() * (MAX-MIN+1))+MIN

SELECT RAND() * 100;

SELECT (RAND() * (250-20+1))+20 AS ALEATORIO;

SELECT FLOOR((RAND() * (250-20+1))+20) AS ALEATORIO;

SET GLOBAL log_bin_trust_function_creators = 1;

DELIMITER $$
CREATE FUNCTION `f_aleatorio`(min INT, max INT) RETURNS int
BEGIN
DECLARE vresultado INT;
SELECT FLOOR((RAND() * (max-min+1))+min) INTO vresultado;
RETURN vresultado;
END$$
DELIMITER ;

SELECT f_aleatorio(1,10) AS RESULTADO;