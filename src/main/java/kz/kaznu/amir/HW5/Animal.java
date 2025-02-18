package kz.kaznu.amir.HW5;

public class Animal {
    String name;
    int speedOfRunning;
    int speedOfSwimming;
    int endurance;
    public Animal (String name, int speedOfRunning, int speedOfSwimming, int endurance) {
        this.name = name;
        this.speedOfRunning = speedOfRunning;
        this.speedOfSwimming = speedOfSwimming;
        this.endurance = endurance;
    }
    public int run (int distance) {
        if (distance > endurance) {
            System.out.println("This animal needs a rest");
            return -1;
        }
        else {
            endurance -= distance;
            int time = distance/speedOfRunning;
            System.out.println("Животное пробежало метров:" + distance + " за " + time + " секунд");
            System.out.println("У животного осталось выносливости:" + endurance);
            return time;
        }
    }
    public int swim (int distance) {
        if (distance > endurance) {
            System.out.println("This animal needs a rest");
            return -1;
        }
        else {
            endurance -= distance;
            int time = distance/speedOfSwimming;
            System.out.println("Животное проплыло метров:" + distance + " за " + time + " секунд");
            System.out.println("У животного осталось выносливости:" + endurance);
            return time;
        }
    }
    public void info() {
        System.out.println("Животное зовут:" + name);
        System.out.println("Его скорость бега(м/с):" + speedOfRunning);
        System.out.println("Его скорость плавания(м/с):" + speedOfSwimming);
        System.out.println("Его выносливость(усл. единиц):" + endurance);
    }
}
