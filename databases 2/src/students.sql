CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    dob DATE NOT NULL,
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    grade INTEGER CHECK (grade >= 1) CHECK (grade <= 12),
    email TEXT UNIQUE NOT NULL
);

INSERT INTO students (first_name, last_name, dob, grade, email)
VALUES
('ანა', 'ბერიძე', '2010-05-01', 7, 'ana.beridze@example.com'),
('ლაშა', 'გიორგაძე', '2011-08-15', 6, 'lasha.giorgadze@example.com'),
('დათა', 'აბაშიძე', '2009-12-22', 8, 'data.abashidze@example.com'),
('მარიამი', 'ნიკოლაძე', '2012-03-30', 5, 'mariam.nikoladze@example.com'),
('გიორგი', 'ცინცაძე', '2010-11-10', 7, 'giorgi.tsintsadze@example.com');

INSERT INTO students (first_name, last_name, dob, grade, email)
VALUES ('ირაკლი', 'ჯოხაძე', '2011-02-14', 15, 'irakli.jokhadze@example.com');

INSERT INTO students (first_name, last_name, dob, grade, email)
VALUES ('ნინო', 'კალანდაძე', '2010-10-10', 6, 'ana.beridze@example.com');

UPDATE students
SET grade = grade + 1
WHERE first_name = 'ლაშა' AND last_name = 'გიორგაძე';

DELETE FROM students
WHERE first_name = 'დათა';
