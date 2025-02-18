package kz.kaznu.amir.HW5;

public class MainApplication {
    public static void main(String[] args) {
        Animal cat = new Cat ("Barsik", 3, 0, 10);
        Animal dog = new Dog ("Korzhik", 4, 4, 12);
        Animal horse = new Horse ("Apple", 6, 1, 13);
        cat.info();
        dog.info();
        horse.info();
        cat.swim(5);
        cat.run(6);
        horse.run(7);
        horse.swim(1);
        dog.run(8);
        dog.swim(3);

    }



}
