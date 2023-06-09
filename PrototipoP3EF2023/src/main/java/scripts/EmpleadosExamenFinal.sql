USE `proyectop312023` ;
CREATE TABLE IF NOT EXISTS tbl_empleados (
    empid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    empnombre VARCHAR(30) NOT NULL,
    empapellido VARCHAR (30) NOT NULL,
    emptelefono int, 
    empdpi int, 
    empdireccion VARCHAR (30) NOT NULL,
    empfechanacimiento date,
    usuid int,
    FOREIGN KEY (usuid) REFERENCES tbl_usuario (usuid)
)ENGINE=InnoDB CHARACTER SET = latin1;