package com.example.librarymanagement.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.librarymanagement.entity.Book;
import com.example.librarymanagement.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void testGetAllBooks() throws Exception {
        // Mock data
        List<Book> books = new ArrayList<>();
        books.add(new Book(1L, "Book 1", "Author 1", 2022)); // Replace "Author 1" and 2022 with appropriate values
        books.add(new Book(2L, "Book 2", "Author 2", 2023)); // Replace "Author 2" and 2023 with appropriate values
        Mockito.when(bookService.getAllBooks()).thenReturn(books);

        // Perform GET request
        mockMvc.perform(get("/books")
                       .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$", hasSize(2)))
               // Add more assertions to match the response JSON structure
               .andExpect(jsonPath("$[0].title", is("Book 1")))
               .andExpect(jsonPath("$[1].title", is("Book 2")));
    }

}
