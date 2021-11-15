package by.verameichyk;

import java.util.Arrays;

public class Book {
    private  int id;
    private  String title;
    private  String[] authors;
    private  int year;
    private  int pages;
    private  int price;
    private Binding binding;

    public Book(int id, String title, String[] authors, int year, int pages, int price, Binding binding) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }
   
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title=" + title +
                ", authors=" + Arrays.toString(authors) +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + binding + '\'' +
                '}';
    }
}


