package kz.kaznu.amir.HW6;

public class Bike implements CurrentTransport {
    @Override
    public boolean ableToMove (Biom biom) {
        return biom != Biom.SWAMP;
    }
    @Override
    public boolean move (int distance, Biom biom) {
        if (!ableToMove(biom)) {
            return false;
        }
        else {
            System.out.println("Велосипед проехал метров: " + distance);
            return true;

        }
    }
}
