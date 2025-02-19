package kz.kaznu.amir.HW4;

public class User {
    public String surname;
    public String name;
    public String secondName;
    public int birthYear;
    public String email;
    public User(String surname, String name, String secondName, int birthYear, String email) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.email = email;
    }
    public void info() {
        System.out.println("ФИО:" + surname + " " + name + " " + secondName);
        System.out.println("Год рождения:" + birthYear);
        System.out.println("e-mail:" + email+"\n");

    }
}
