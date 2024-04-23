# Library Management Application

This is a simple library management application developed using Spring Boot.

## Setup Instructions

1. Clone the repository to your local machine:

   git clone 'https://github.com/Anirudhxx/libraryManagement.git/

2.  Navigate to the project directory:
    cd library-management
3. Make sure you have Java and Maven installed on your machine.

4. Build the application using Maven:
   mvn clean package

## Running the Application

1. Once the build is successful, you can run the application using the following command:


## Sample Requests

1. Get all books

To retrieve all books stored in the library, send a GET request to the following endpoint:

    bash
    
    GET /api/books

This request will return a list of all books available in the library's catalog.
2. Get a book by ID

To retrieve a specific book from the library using its unique identifier (ID), send a GET request to the following endpoint, replacing {id} with the actual ID of the book:

    bash
    
    GET /api/books/{id}
    
    For example, to get the details of a book with ID 1, the request would look like this:
    
    
    bash

    GET /api/books/1

This request will return the details of the book with the specified ID if it exists in the library's catalog. If no book is found with the provided ID, the API will respond with a 404 Not Found status code.

### 3. Create a new book

    POST /api/books
    Content-Type: application/json
    
    {
    "title": "Sample Book",
    "author": "John Doe",
    "publicationYear": 2022
    }



### 4. Update a book

    PUT /api/books/{id}
    Content-Type: application/json
    
    {
    "title": "Updated Book Title",
    "author": "Jane Doe",
    "publicationYear": 2023
    }



### 5. Delete a book

    DELETE /api/books/{id}
    
    


## Testing

You can also test the application using tools like Postman or curl. Make sure the application is running locally before sending requests.

Feel free to customize this README file based on your specific application features and requirements.