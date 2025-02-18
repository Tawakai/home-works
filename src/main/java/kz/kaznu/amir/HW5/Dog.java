package kz.kaznu.amir.HW5;

public class Dog extends Animal {
    public Dog (String name, int speedOfRunning, int speedOfSwimming, int endurance) {
        super (name, speedOfRunning, speedOfSwimming, endurance);
    }
    @Override
    public int swim (int distance) {
        if (distance * 2  > endurance) {
            System.out.println("This animal needs a rest");
            return -1;
        }
        else {
            endurance -= distance * 2;
            int time = distance/speedOfSwimming;
            System.out.println("Животное проплыло метров:" + distance + " за " + time + " секунд");
            System.out.println("У животного осталось выносливости:" + endurance);
            return time;
        }
    }
}
