package kz.kaznu.amir.HW6;

import java.util.concurrent.Callable;

public class MainApplication {
    public static void main(String[] args) {
        Human human = new Human ("Chester");
        CurrentTransport car = new Car ();
        CurrentTransport bike = new Bike();
        CurrentTransport horse = new Horse();
        CurrentTransport vezdehod = new Vezdehod();
        human.move(10, Biom.FOREST);
        human.takeASeat(car);
        human.move(20, Biom.SWAMP);
        human.move(20, Biom.PLAIN);
        human.goAway();
        human.takeASeat(vezdehod);
        human.move(20, Biom.SWAMP);

    }
}
