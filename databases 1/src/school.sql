CREATE DATABASE school;



CREATE TABLE teachers (
    id BIGINT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    hire_date DATE,
    email VARCHAR(100)
);



SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public';



INSERT INTO teachers (id, first_name, last_name, hire_date, email) VALUES
(1, 'Nino', 'Beridze', '2008-09-01', 'nino.beridze@example.com'),
(2, 'Giorgi', 'Mchedlishvili', '2010-03-15', 'giorgi.mchedlishvili@example.com'),
(3, 'Tamar', 'Kapanadze', '2012-06-20', 'tamar.kapanadze@example.com'),
(4, 'Irakli', 'Davitashvili', '2016-09-05', 'irakli.davitashvili@example.com'),
(5, 'Mariam', 'Khutsishvili', '2005-02-10', 'mariam.khutsishvili@example.com');



SELECT * FROM teachers
WHERE hire_date > '2009-12-31';



ALTER TABLE teachers
ADD COLUMN department VARCHAR(100);



ALTER TABLE teachers
RENAME COLUMN email TO contact_email;


SELECT first_name, contact_email FROM teachers
WHERE hire_date < '2015-01-01' OR hire_date > '2018-12-31';
