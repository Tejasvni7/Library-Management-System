package com.application.library;

import com.application.library.entity.Author;
import com.application.library.entity.Book;
import com.application.library.entity.Category;
import com.application.library.entity.Publisher;
import com.application.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args) -> {
            Book book1 = new Book("123", "Serendipity", "SciFi");
            Author author1 = new Author("Tejaswini", "Fiction writer");
            Category category1 = new Category("Fictional");
            Publisher publisher1 = new Publisher("Publisher_23");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

            Book book2 = new Book("456", "Euphoria", "ROMCOM");
            Author author2 = new Author("Royyapally", "Comic");
            Category category2 = new Category("Comedy");
            Publisher publisher2 = new Publisher("Publisher_89");
            book2.addAuthor(author2);
            book2.addCategory(category2);
            book2.addPublisher(publisher2);
            bookService.createBook(book2);

            Book book3 = new Book("890", "Red String", "Horror Thriller");
            Author author3 = new Author("Test name3", "Suspense");
            Category category3 = new Category("Thriller & Suspense");
            Publisher publisher3 = new Publisher("Publisher_67");
            book3.addAuthor(author3);
            book3.addCategory(category3);
            book3.addPublisher(publisher3);
            bookService.createBook(book3);
        };
    }

}
