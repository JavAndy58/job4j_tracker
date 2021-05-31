package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == - 1) {
            throw new ElementNotFoundException("Ключ не найден");
        }
        return rsl;
    }
        public static void main (String[]args) throws ElementNotFoundException{
            String[] names = {"Nik", "Oleg", "Petr"};
            try {
                int result = indexOf(names, "Oleghh");
                System.out.println("Индекс ключа: " + result);
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
}
