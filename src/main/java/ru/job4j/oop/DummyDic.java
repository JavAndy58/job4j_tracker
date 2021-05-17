package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String result = "Неизвестное слово. ";
        return result + eng;
    }

    public static void main(String[] args) {
        DummyDic translat = new DummyDic();
        String rsl = translat.engToRus("Hello");
        System.out.println(rsl);
    }
}
