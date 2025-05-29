package src;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable {
    String name;
    List<Book> books;

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void display(){
        System.out.println("Library : " + name);
        for(Book book : books){
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }

    // Shallow clone
    public Library shallowClone() throws CloneNotSupportedException {
        return (Library) this.clone();
    }

    // Deep clone
    public Library deepClone() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library) this.clone(); // shallow copy

        deepClonedLibrary.books = new ArrayList<>();

        for(Book book : this.books){
            deepClonedLibrary.books.add(new Book(book.title, book.author));
        }

        return deepClonedLibrary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
