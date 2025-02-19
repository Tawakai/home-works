package kz.kaznu.amir.HW6;

public class Horse implements CurrentTransport {
    private int force;
    public Horse () {
        this.force = 100;
    }
    @Override
    public boolean ableToMove (Biom biom) {
        return biom != Biom.SWAMP;
    }
    @Override
    public boolean move (int distance, Biom biom) {
        if (force <= 0) {
            System.out.println("Horse needs a rest");
            return false;
        }
        else if (ableToMove(biom)) {
            force -= distance;
            System.out.println("Лошадь пробежала м: " + distance);
            return true;
        }
        else {
            return false;
        }
    }
}
