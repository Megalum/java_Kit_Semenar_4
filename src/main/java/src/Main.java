package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.add(964, "Иван", "685-42-01", "2 года");
        for (Employee o: dir.getDirectory()) {
            System.out.println(o.toString());
        }
        System.out.println();

        List<Employee> name = dir.searchName("Иван");
        System.out.println();

        List<Employee> experience = dir.searchExperience("2 года");
        System.out.println();

        Employee number = dir.searchNumber(125);
        System.out.println();

        Employee number2 = dir.searchNumber(1542);

    }
}