-- Insert authors
INSERT INTO Author (name, biography) VALUES ('J.K. Rowling', 'British author best known for the Harry Potter series.');
INSERT INTO Author (name, biography) VALUES ('George Orwell', 'English novelist and essayist, known for his dystopian novel 1984.');
INSERT INTO Author (name, biography) VALUES ('Agatha Christie', 'English writer known for her detective novels.');

-- Insert books
INSERT INTO Book (title, author_id, isbn, publication_year) VALUES ('Harry Potter and the Philosopher''s Stone', 1, '978-0747532743', 1997);
INSERT INTO Book (title, author_id, isbn, publication_year) VALUES ('Animal Farm', 2, '978-0451526342', 1945);
INSERT INTO Book (title, author_id, isbn, publication_year) VALUES ('Murder on the Orient Express', 3, '978-0062693662', 1934);

-- Insert rentals
INSERT INTO Rental (book_id, renter_name, rental_date, return_date) VALUES (1, 'John Doe', '2023-01-01', '2023-01-14');
INSERT INTO Rental (book_id, renter_name, rental_date, return_date) VALUES (2, 'Jane Smith', '2023-02-01', '2023-02-14');
