package com.example.librarymanagement.service;

import com.example.librarymanagement.entity.Author;
import com.example.librarymanagement.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(Long id, Author author) {
        if (!authorRepository.existsById(id)) {
            return null;
        }
        author.setId(id);
        return authorRepository.save(author);
    }

    public boolean deleteAuthor(Long id) {
        if (!authorRepository.existsById(id)) {
            return false;
        }
        authorRepository.deleteById(id);
        return true;
    }
}
