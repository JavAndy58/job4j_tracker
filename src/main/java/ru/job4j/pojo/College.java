package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иван Иванов Иванович");
        student.setGroup("1PCB2020");
        student.setDateAdmission(new Date());
        System.out.println("Имя студента: " + student.getFullName() +
                System.lineSeparator() + "Группа: " + student.getGroup() +
                System.lineSeparator() + "Дата поступления: " + student.getDateAdmission());

    }
}
