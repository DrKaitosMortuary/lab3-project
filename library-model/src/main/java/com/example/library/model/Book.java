package com.example.library.model;

/**
 * Класс, представляющий книгу в библиотеке.
 * Содержит базовую информацию: название, автора и год написания.
 * 
 * @author Ваше Имя
 * @version 1.0
 */
public class Book {

    /** Название книги. */
    private String title;

    /** Автор книги. */
    private String author;

    /** Год написания книги. */
    private int year;

    /**
     * Конструктор для создания новой книги.
     *
     * @param title  название книги
     * @param author автор книги
     * @param year   год написания книги
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * Возвращает название книги.
     *
     * @return название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Возвращает автора книги.
     *
     * @return имя автора
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Возвращает год написания книги.
     *
     * @return год написания
     */
    public int getYear() {
        return year;
    }

    /**
     * Формирует и возвращает полную информацию о книге
     * в удобном для чтения формате.
     *
     * @return строка с названием, автором и годом написания
     */
    public String getInfo() {
        return "\"" + title + "\" - " + author + ", " + year + " г.";
    }
}