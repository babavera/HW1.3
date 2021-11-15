package by.verameichyk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static List<Book> getBooksList() {
        return List.of(
                new Book(1, "Облачные архитектуры.Разработка устойчивых и экономичных облачных приложений",
                        new String[] {"Арора, Лащевски"}, 2021, 320, 67, Binding.SOFT),
                new Book(2, "Познакомтесь,JavaScript", new String[] {"Симпсон К."}, 2020, 192, 48, Binding.SOLID),
                new Book(3, "Библия Linux.10-е изд.", new String[] {"Негус К."}, 2019, 928, 175, Binding.SOLID),
                new Book(4, "Head First. Паттерны проектирования", new String[] {"Робсо, Фримен Э."}, 2017, 640, 89, Binding.SOFT),
                new Book(5, "Дар. 12 ключей к внутреннему освобождению и обретению себя",
                        new String[] {"Эсме, Эдит Ева Эгер"}, 2016, 256, 30, Binding.SOLID),
                new Book(6, "Будет кровь", new String[] {"Кинг С."}, 1995, 544, 27, Binding.SOLID),
                new Book(7, "Волки Кальи", new String[] {"Кинг С."}, 2001, 768, 30, Binding.SOLID),
                new Book(8, "1984", new String[] {"Оруэлл Д."}, 2019, 320, 17, Binding.SOFT),
                new Book(9, "Славно, славно мы резвились", new String[] {"Оруэлл Д."}, 2015, 320, 19, Binding.SOLID)
        );
    }

    public static List<Book> filterByAuthor(List<Book> books, String[] authors){
        return books.stream()
            .filter(book -> Arrays.equals(book.getAuthors(), authors))
                .collect(Collectors.toList());
    }

    public static List<Book> filterByWords(List<Book> books, String word){
        return books.stream()
                .filter(book -> book.getTitle().contains(word))
                .collect(Collectors.toList());
    }

    public static List<Book> filterByYear(List<Book> books, int yearMin, int yearMax){

        return books.stream()
                .filter(book -> (book.getYear() >= yearMin && book.getYear() <= yearMax))
                .collect(Collectors.toList());
    }

    public static void printBooks(List<Book> arg) {
        arg.forEach(System.out::println);
        System.out.println();
    }
}
