package lt.codeacademy.javau5.crud.controllers;

import lt.codeacademy.javau5.crud.entities.Book;
import lt.codeacademy.javau5.crud.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/index")
    public String showBookList(Model model) {
        model.addAttribute( "books", bookRepository.findAll() );
        return "index";
    }

    @GetMapping("/create")
    public String showBookCreationForm(Book book, Model model) {
        model.addAttribute( "book", new Book() );
        return "add-book";
    }

    @PostMapping("/addbook")
    public String addBook(Book book, BindingResult result, Model model) {
        System.out.println( book.toString() );

        if (result.hasErrors()) {
            System.out.println( "ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR");
            return "add-book";
        }
        bookRepository.save(book);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showBookUpdateForm(@PathVariable("id") Long id, Model model ) {
        Book book = bookRepository
                .findById(id)
                .orElseThrow( () -> new IllegalArgumentException("Invalid book Id:" + id) );

        model.addAttribute("book", book);
        return "update-book";
    }

    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") Long id, Book book, Model model) {
        bookRepository.save(book);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, Model model) {
        Book book = bookRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id));
        bookRepository.delete(book);
        return "redirect:/index";
    }
}
