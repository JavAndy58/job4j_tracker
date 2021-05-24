package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Sorting an array ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item imem:items) {
                        System.out.println(imem);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            }else if (select == 3) {
                System.out.println("=== Delete of application ===");
                System.out.println("Enter id: ");
                int index = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(index)) {
                    System.out.println("status: delete OK");
                } else {
                    System.out.println("status: delete No");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item===");
                int index = Integer.parseInt(scanner.nextLine());
                Item temp = tracker.findById(index);
                if (temp != null) {
                    System.out.println(temp);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = scanner.nextLine();
                Item[] temp = tracker.findByName(name);
                if (temp.length > 0) {
                    for (Item item: temp) {
                        System.out.println(item);
                    }
                }else {
                        System.out.println("Заявки с таким именем не найдены");
                    }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i <menu.length; i++ ) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}