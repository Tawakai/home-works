package kz.kaznu.amir.HW6;

public class Vezdehod implements CurrentTransport {
    private int fuel;
    public Vezdehod () {
        this.fuel = 100;
    }
    @Override
    public boolean ableToMove(Biom biom) {
        return true;
    }
    @Override
    public boolean move (int distance, Biom biom) {
        if (fuel <= 0) {
            System.out.println("No fuel");
            return false;
        }
        else {
            fuel -= distance/2;
            System.out.println("Вездеход проехал м: " + distance);
            return true;
        }
    }
}
