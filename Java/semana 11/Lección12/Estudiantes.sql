-- Comenzamos con CRUD: Create(crear/insertar), Read(leer), Update(actualizar/modificar) y Delete(eliminar)
-- Listar todo de la tabla estudiantes2022
SELECT * FROM Estudiantes.estudiantes2022;
-- Insertar un estudiante
INSERT INTO Estudiantes.estudiantes2022 (nombre,apellido,telefono,email) VALUES ("Juan", "Perez", "2615595521", "jp@email.com");
-- Actualizar/Modificar
UPDATE Estudiantes.estudiantes2022 SET nombre="Juan Carlos", apellido="Minotto" WHERE idestudiantes2022 = 1;
-- Eliminar
DELETE FROM Estudiantes.estudiantes2022 WHERE idestudiantes2022 = 1;
-- Para modificar el idestudiantes2022 y que comience en 1 (ESTO NO ES RECOMENDABLE)
ALTER TABLE Estudiantes.estudiantes2022 AUTO_INCREMENT = 1;
