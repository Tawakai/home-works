package kz.kaznu.amir.HW6;

public class Car implements CurrentTransport {
    private int fuel;
    public Car () {
        this.fuel = 100;
    }
    @Override
    public boolean ableToMove (Biom biom) {
        if (biom !=Biom.FOREST && biom !=Biom.SWAMP) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public boolean move (int distance, Biom biom) {
        if (fuel <= 0) {
            System.out.println("У машины закончился запас бензина");
            return false;
        }
        else if (ableToMove(biom)) {
            fuel -= distance/5;
            System.out.println("Машина проехала метров: " + distance);
            return true;
        }
        else {
            return false;
        }
    }
}
