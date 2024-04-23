package com.example.librarymanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.example.librarymanagement.entity.Book;
import com.example.librarymanagement.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testGetAllBooks() {
        // Mock data
        List<Book> books = new ArrayList<>();
        books.add(new Book(1L, "Book 1", "Author 1", 2022));
        books.add(new Book(2L, "Book 2", "Author 2", 2023));
        Mockito.when(bookRepository.findAll()).thenReturn(books);

        // Test the service method
        List<Book> result = bookService.getAllBooks();

        // Assertions
        assertEquals(2, result.size());
    }

}
