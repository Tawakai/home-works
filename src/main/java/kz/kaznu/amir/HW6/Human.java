package kz.kaznu.amir.HW6;

public class Human {
    private String name;
    private CurrentTransport transport;
    public Human (String name) {
        this.name = name;
        this.transport = null;
    }
    public void takeASeat(CurrentTransport currentTransport) {
        this.transport = currentTransport;
        System.out.println(name + " взял в качестве транспорта " + currentTransport.getClass().getName());
    }
    public void goAway () {
        if (transport != null) {
            System.out.println(name + " встал с " + transport.getClass().getName());
            transport = null;
        }
        else {
            System.out.println("You have no transport right now");
        }
    }
    public boolean move (int distance, Biom biom) {
        if (transport != null) {
            if (transport.ableToMove(biom)) {
                return transport.move(distance, biom);
            }
            else {
                System.out.println("Impossible to move on that type of transport here");
                return false;
            }
        }
        else {
            System.out.println(name + " пешком прошел м: " + distance);
            return true;
        }
    }
}
