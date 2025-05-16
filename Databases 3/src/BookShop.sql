CREATE TABLE Authors (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    first_name TEXT,
    last_name TEXT
);

CREATE TABLE Books (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    author_id INTEGER,
    price REAL NOT NULL,
    FOREIGN KEY (author_id) REFERENCES Authors(id)
);

CREATE TABLE Sales (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    book_id INTEGER,
    quantity INTEGER,
    sale_date DATE,
    FOREIGN KEY (book_id) REFERENCES Books(id)
);


INSERT INTO Authors (first_name, last_name) VALUES
('Jane', 'Austen'),
('Charles', 'Dickens'),
('Mark', 'Twain'),
('Leo', 'Tolstoy'),
('Fyodor', 'Dostoevsky');

INSERT INTO Books (title, author_id, price) VALUES
('Pride and Prejudice', 1, 19.99),
('David Copperfield', 2, 15.00),
('Adventures of Huckleberry Finn', 3, 8.99),
('Emma', 1, 12.50),
('Great Expectations', 2, 10.00);

INSERT INTO Sales (book_id, quantity, sale_date) VALUES
(1, 2, '2024-01-10'),
(2, 1, '2024-01-11'),
(5, 3, '2024-01-12'),
(3, 4, '2024-01-13'),
(4, 1, '2024-01-12');

SELECT
    authors.id AS author_id,
    authors.first_name,
    authors.last_name,
    books.id AS book_id,
    books.title,
    books.price
FROM books
INNER JOIN authors ON books.author_id = authors.id;

SELECT SUM(books.price * sales.quantity) AS total_sales
FROM sales
INNER JOIN books ON sales.book_id = books.id;

SELECT
    books.title,
    authors.first_name,
    authors.last_name
FROM sales
INNER JOIN books ON sales.book_id = books.id
INNER JOIN authors ON books.author_id = authors.id
WHERE sales.sale_date = '2024-01-12';
