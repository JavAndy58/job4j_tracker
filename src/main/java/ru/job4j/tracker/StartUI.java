package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
//        Tracker tracker = new Tracker();
//        tracker.add(new Item());
//        System.out.println(tracker.findById(20));
          Item item1 = new Item();
          item1.setName("poke");
          Item item2 = new Item();
          item2.setName("moke");
          Item item3 = new Item();
          Item item4 = new Item();
          item4.setName("soke");

          Tracker tracker = new Tracker();
          tracker.add(item1);
          tracker.add(item2);
          tracker.add(item3);
          tracker.add(item4);

          Item[] result = tracker.findAll();

          for (int i = 0; i < result.length; i++) {
                Item temp = result[i];
                System.out.println(temp.getId() + " " + temp.getName() + " * ");
          }






    }
}