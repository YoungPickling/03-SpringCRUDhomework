//package lt.codeacademy.javau5.crud.services;
//
//import lt.codeacademy.javau5.crud.configurations.MyConfiguration;
//import lt.codeacademy.javau5.crud.entities.Book;
//import lt.codeacademy.javau5.crud.repositories.BookRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class BookService {
//
//    private static Logger log = LoggerFactory.getLogger(MyConfiguration.class);
//
//    @Autowired
//    BookRepository bookRepository;
//
//    public boolean seedRepo() {
//        if(bookRepository.count() == 0) {
//            List<Book> books = new ArrayList<>();
//            books.add(new Book(1L, "0-4894-8651-7", "Alice in Wonderland", "Lewis Carroll",            1865, "Fantasy", 11L));
//            books.add(new Book(2L, "0-9193-6415-2", "The Great Gatsby",    "Francis Scott Fitzgerald", 1925, "Novel",   7L));
//            books.add(new Book(3L, "0-4159-5647-1", "Dėdės ir dėdienės",   "Juozas Tumas-Vaižgantas",  1929, "Fiction", 9L));
//            bookRepository.saveAll(books);
//            return true;
//        }
//        return false;
//    }
//}
