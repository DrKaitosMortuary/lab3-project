package com.example.library.app;

import com.example.library.model.Book;
import com.example.library.model.Library;

/**
 * Главный класс приложения для демонстрации работы
 * иерархии классов библиотеки.
 * 
 * @author Корытко Анастасия Витальевна
 * @version 1.0
 */
public class App {

    /**
     * Точка входа в программу.
     * Создает объекты библиотек, добавляет книги и выводит информацию.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // 1. Создаем несколько объектов библиотек
        Library lib1 = new Library("Городская библиотека");
        Library lib2 = new Library("Библиотека им. Пушкина");

        // 2. Добавляем книги в первую библиотеку
        lib1.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        lib1.addBook(new Book("Анна Каренина", "Лев Толстой", 1877));
        lib1.addBook(new Book("Преступление и наказание", "Фёдор Достоевский", 1866));

        // 3. Добавляем книги во вторую библиотеку
        lib2.addBook(new Book("Евгений Онегин", "Александр Пушкин", 1833));
        lib2.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));

        // 4. Выводим информацию по всем книгам каждой библиотеки
        lib1.printAllBooks();
        System.out.println();
        lib2.printAllBooks();
        
        // 5. Выводим книги определенного автора (из первой библиотеки)
        System.out.println("\nКниги Толстого в первой библиотеке:");
        lib1.findByAuthor("Лев Толстой").forEach(b -> System.out.println("  - " + b.getInfo()));
    }
}