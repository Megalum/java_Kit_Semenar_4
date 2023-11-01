package src;

public class Employee {
    private int number;
    private String phone, name, experience;

    public Employee (int number, String name, String phone, String experience){
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumber() {
        return number;
    }

    public String getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ", таб. " + number + ", номер телефона: " + phone + ", стаж " + experience;
    }
}
