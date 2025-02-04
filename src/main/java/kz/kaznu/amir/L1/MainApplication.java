package kz.kaznu.amir.L1;

import java.util.Scanner;

public class MainApplication {
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");;
    }
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная"); }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = 13;
        if (data <= 10) {
            System.out.println("Red");
        }
        else if (data > 10 && data <= 20) {
            System.out.println("Yelow");
        }
        else if (data > 20) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int aa = 7;
        int bb = 19;
        if (aa >+ bb) {
            System.out.println("aa>=bb");
        }
        else {
            System.out.println("a<b");
        }
    }
    public static void addOrSub (int initValue, int delta, boolean increment) {
        if (increment = true) {
            initValue += delta;
            System.out.println(initValue);

        }
        else {
            initValue -= delta;
            System.out.println(initValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 для выбора метода:");
        int vybor = scanner.nextInt();
        if (vybor == 1) {
            greetings();
        }
        else if (vybor == 2) {
            checkSign(1, 2, 4);
        }
        else if (vybor == 3) {
            selectColor();
        }
        else if (vybor == 4) {
            compareNumbers();
        }
        else if (vybor == 5) {
            addOrSub(10, 20, true);
        }
        else {
            System.out.println("Вы выбрали невозможную опцию");
        }
    }
}
