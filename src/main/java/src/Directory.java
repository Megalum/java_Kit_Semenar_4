package src;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private List<Employee> directory = new ArrayList<>();

    public Directory(){
        add(123, "Иван", "123-45-67", "2 года");
        add(321, "Иван", "111-22-33", "1,5 года");
        add(125, "Борис", "444-55-66", "5 лет");
        add(133, "Дмитрий", "777-88-99", "2 года");
        add(1231, "Сергей", "765-43-21", "10 лет");
    }

    private void printResult(List<Employee> e){
        if (e.size() == 0)
            System.out.println("Результаты поиска ничего не дали...");
        else
            for (Employee o: e) {
                System.out.println(o.toString());
            }
    }

    public List<Employee> searchExperience(String experience){
        List<Employee> result = new ArrayList<>();

        for (Employee o: this.directory) {
            if (o.getExperience().equals(experience)){
                result.add(o);
            }
        }

        printResult(result);
        return result;
    }

    public Employee searchNumber(int number){
        for (Employee o: this.directory) {
            if (o.getNumber() == number){
                System.out.println(o.toString());
                return o;
            }
        }

        System.out.println("Результаты поиска ничего не дали...");
        return null;
    }

    public List<Employee> searchName(String name){
        List<Employee> result = new ArrayList<>();

        for (Employee o: this.directory) {
            if (o.getName().equals(name)){
                result.add(o);
            }
        }

        printResult(result);
        return result;
    }

    public void add(int number, String name, String phone, String experience){
        directory.add(new Employee(number, name, phone, experience));
    }

    public List<Employee> getDirectory() {
        return directory;
    }
}
