package by.verameichyk;



import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Book> books = StreamAPI.getBooksList();

        List<Book> authors = StreamAPI.filterByAuthor(books, new String [] {"Кинг С."});

        List<Book> word = StreamAPI.filterByWords(books, "Java");

        List<Book> year = StreamAPI.filterByYear(books, 2001, 2014);

        StreamAPI.printBooks(authors);

        StreamAPI.printBooks(word);

        StreamAPI.printBooks(year);
    }
}
