package com.library.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.library.model.Book;
import com.library.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book saveBook(Book book) {
        return repo.save(book);
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}
