#Library Management Application - Spring Boot

## Getting Started:
Clone the Repository:

```bash
git clone https://github.com/Anirudhxx/libraryManagement.git
```
Use code with caution.
## Navigate to the Project:

```bash
cd library-management
```
Use code with caution.

## Prerequisites:
Ensure you have Java and Maven installed on your system.

## Build the Application:
```bash
mvn clean package
````
Use code with caution.

## Running the Application:

Start the Application:
```bash
java -jar library-management-0.0.1-SNAPSHOT.jar
```
Use code with caution.

Verify Startup: Check the console for logs indicating successful application startup.

## Sample API Requests:

1. Get All Books:
Retrieve all books in the library using a GET request to:
```bash
GET /api/books
````
This request returns a JSON response containing a list of all available books.

2. Get Book by ID:
To get details of a specific book, send a GET request to:
```bash
GET /api/books/{id}
```
Replace {id} with the actual book ID. For example, to get details of book ID 1:
```bash
GET /api/books/1
```
This request returns a JSON response with details of the specified book or a 404 Not Found if the ID doesn't exist.

3. Create a New Book:
Create a new book by sending a POST request to:
```bash
POST /api/books
Content-Type: application/json
{
"title": "Sample Book",
"author": "John Doe",
"publicationYear": 2022
}
````

Replace the example details with your desired book information. The response will be the newly created book's details in JSON format.

4. Update a Book:
Update an existing book by sending a PUT request to:
```bash
PUT /api/books/{id}
Content-Type: application/json
{
    "title": "Updated Book Title",
    "author": "Jane Doe",
    "publicationYear": 2023
}
```
Replace {id} with the book's ID and provide updated information in the JSON body. The response will be the updated book details.

5. Delete a Book:
Delete a book by sending a DELETE request to:
```bash
DELETE /api/books/{id}
```

Replace {id} with the book's ID. The response will be a success message upon deletion or an error message if the book doesn't exist.

## Testing:

Use tools like Postman or curl to test the API endpoints. Ensure the application is running before sending requests.

Customization:

Feel free to modify this README to reflect your specific application features and requirements.