package kz.kaznu.amir.HW4;

public class Box {
    private String color;
    private String size;
    private boolean openOrNot;
    private boolean fullOrNot;
    public Box(String size, String color) {
        this.size = size;
        this.color = color;
        this.openOrNot = false;
        this.fullOrNot = false;
    }
    public void open() {
        if (!openOrNot) {
            openOrNot = true;
            System.out.println("box was opened");
        }
        else {
            System.out.println("already open");
        }
    }
    public void close() {
        if (openOrNot) {
            openOrNot = false;
            System.out.println("box was closed");
        }
        else {
            System.out.println("box is already closed");
        }
    }
    public void anotherColor (String newColor) {
        color = newColor;
        System.out.println("From now box is:" + color);
    }
    public void itemInIt () {
        if (openOrNot) {
            if (!fullOrNot) {
                fullOrNot = true;
                System.out.println("Now box has an item in it");
            }
            else {
                System.out.println("box can contain only 1 item");
            }
        }
        else {
            System.out.println("you should open box firstly");
        }
    }
    public void itemOutOfIt() {
        if (openOrNot) {
            if (fullOrNot) {
                fullOrNot = false;
                System.out.println("box is now empty");
            }
            else {
                System.out.println("box was empty, box is still empty");
            }
        }
        else {
            System.out.println("do you know how to deal with boxes?");
        }
    }
    public void info() {
        System.out.println("Size of box:" + size);
        System.out.println("Color of box:" + color);
        if (openOrNot) {
            System.out.println("Box is open");
        }
        else {
            System.out.println("Box is closed");
        }
        if (fullOrNot) {
            System.out.println("There is an item in the box");
        }
        else {
            System.out.println("Box is empty");
        }
    }
}
