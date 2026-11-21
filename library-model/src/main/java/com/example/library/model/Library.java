package com.example.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, представляющий библиотеку.
 * Хранит название библиотеки и коллекцию книг.
 * Реализует композицию: библиотека содержит в себе книги.
 * 
 * @author Ваше Имя
 * @version 1.0
 */
public class Library {

    /** Название библиотеки. */
    private String name;

    /** Коллекция книг, хранящихся в библиотеке. */
    private List<Book> books = new ArrayList<>();

    /**
     * Конструктор для создания библиотеки.
     *
     * @param name название библиотеки
     */
    public Library(String name) {
        this.name = name;
    }

    /**
     * Возвращает название библиотеки.
     *
     * @return название библиотеки
     */
    public String getName() {
        return name;
    }

    /**
     * Добавляет новую книгу в коллекцию библиотеки.
     *
     * @param book объект книги, который нужно добавить
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Находит все книги заданного автора.
     * Поиск выполняется без учета регистра.
     *
     * @param author имя автора для поиска
     * @return список книг, написанных указанным автором
     */
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    /**
     * Выводит в консоль полную информацию о всех книгах,
     * хранящихся в данной библиотеке.
     */
    public void printAllBooks() {
        System.out.println("Библиотека \"" + name + "\":");
        for (Book b : books) {
            System.out.println("  - " + b.getInfo());
        }
    }
}