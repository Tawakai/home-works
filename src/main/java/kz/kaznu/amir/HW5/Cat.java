package kz.kaznu.amir.HW5;

public class Cat extends Animal {
    public Cat (String name, int speedOfRunning, int speedOfSwimming, int endurance) {
        super (name, speedOfRunning, 0, endurance);
    }
    @Override
    public int swim (int distance) {
        System.out.println("Cats cant swim!");
        return -1;
    }
}
