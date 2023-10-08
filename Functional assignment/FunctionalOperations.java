package com.learn.functional.assignment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map.Entry;
import java.util.OptionalDouble;

public class FunctionalOperations {

    public static void main(String[] args) {
        
        // Assignment 1: Mapping - print only the names of all the movies
        List<Movie> movies = Arrays.asList(
            new Movie("Spotlight", 2015, "Hollywood"),
            new Movie("Avengers: Infinity War", 2018, "Hollywood"),
            new Movie("Inception", 2010, "Hollywood"),
            new Movie("Forest Gump", 1994, "Hollywood"),
            new Movie("3 Idiots", 2009, "Bollywood"),
            new Movie("Beauty and the Beast", 2017, "Hollywood"),
            new Movie("Slumdog Millionaire", 2008, "Bollywood")
        );
        
        // Using functional programming to print movie names
        movies.stream()
              .map(Movie::getName) // Extract the name of each movie
              .forEach(System.out::println); // Print each name
        
        // Assignment 1: Traversal - print all the movie objects
        movies.forEach(System.out::println);
        
        // Assignment 1: Sorting - sort and print in increasing order of release date
        movies.stream()
              .sorted((m1, m2) -> Integer.compare(m1.getReleaseYear(), m2.getReleaseYear()))
              .forEach(System.out::println);
        
        // Assignment 1: Print a string containing all the movie names
        String allMovieNames = movies.stream()
                                     .map(Movie::getName)
                                     .collect(Collectors.joining(", "));
        System.out.println(allMovieNames);
        
        // Assignment 2: Traversal using forEach
        Map<String, String> contacts = new HashMap<>();
        contacts.put("1237589020", "John");
        contacts.put("1237009020", "John");
        contacts.put("7890291111", "Neal");
        contacts.put("2647210290", "Raju");
        contacts.put("9999999999", "Peter");
        contacts.put("9081234567", "Neha");
        
        contacts.forEach((k, v) -> System.out.println(k + " - " + v));
        
        // Assignment 2: Filter - print the contacts for which the name is John
        contacts.entrySet().stream()
                .filter(entry -> "John".equals(entry.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        
        // Assignment 2: Collect - collect all the contacts with the name John in a map
        Map<String, String> johnContacts = contacts.entrySet().stream()
                .filter(entry -> "John".equals(entry.getValue()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        System.out.println(johnContacts);
        
        // Assignment 2: Map - create a String having all the names separated by a comma
        String allNames = contacts.values().stream()
                                    .collect(Collectors.joining(", "));
        System.out.println(allNames);
        
        // Assignment 2: Reduce - find out the average of all the marks
        Map<String, Double> marks = new HashMap<>();
        marks.put("Science", 66.00);
        marks.put("Maths", 78.00);
        marks.put("English", 90.00);
        
        OptionalDouble average = marks.values().stream()
                                          .mapToDouble(Double::doubleValue)
                                          .average();
        
        average.ifPresent(avg -> System.out.println("Average marks: " + avg));
    }
}
