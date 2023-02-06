package ObjectAndClass;

import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(String name, int year, Author author){
        this.name = name;
        this.year = year;
        this.author = author;
    }



    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }
}

