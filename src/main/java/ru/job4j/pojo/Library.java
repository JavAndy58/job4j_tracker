package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaNew = new Book("JavaNew", 550);
        Book ci = new Book("Ci", 500);
        Book php = new Book("PHP", 300);
        Book cleanCode = new Book("Clean code", 470);
        Book[] books = new Book[4];
        books[0] = javaNew;
        books[1] = ci;
        books[2] = php;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumberPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Книги после перестановки");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumberPages());
        }
        System.out.println("Вывод книг с названием : Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if(bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " - " + bk.getNumberPages());
            }
        }
    }
}
