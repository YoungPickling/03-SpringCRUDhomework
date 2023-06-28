package lt.codeacademy.javau5.crud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @NotBlank(message = "ISBN is mandatory")
    private String isbn;

//    @NotBlank(message = "Name is mandatory")
    private String name;

//    @NotBlank(message = "Author is mandatory")
    private String author;

//    @NotBlank(message = "Year is mandatory")
    private int year;

//    @NotBlank(message = "Category is mandatory")
    private String category;

//    @NotBlank(message = "Amount is mandatory")
    private long amount;

    public Book() {}

    public Book( long id, String isbn, String name, String author, int year, String category, long amount) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.year = year;
        this.category = category;
        this.amount = amount;
    }

    public void setId(long id) {this.id = id;}

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getId() {return id;}

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", isbn=" + isbn + ", name=" + name + ", author=" + author + ", year=" + year + ", category=" + category + ", amount=" + amount + "]";
    }
}
