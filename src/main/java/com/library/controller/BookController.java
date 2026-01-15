package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.library.model.Book;
import com.library.service.BookService;

@Controller
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewBooks(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "index";
    }

    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute Book book) {
        service.saveBook(book);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", service.getBookById(id));
        return "edit-book";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return "redirect:/";
    }
}
