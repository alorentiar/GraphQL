package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1,"Bible",604,1),
            new Book(2,"Harry",500,2),
            new Book(3,"Suyanto",345,2),
            new Book(4,"Spring",119,1 )
            );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();

    }
}


