package kz.kaznu.amir.HW8;

import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        minAndMax(2, 7);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(17);
        list.add(6);
        System.out.println(list);
        System.out.println(findSum(list));
        System.out.println(increaseArrayList(5, list));
        System.out.println(fillArray(32, list));
    }


    public static ArrayList<Integer> minAndMax(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        System.out.println(list);
        return list;
    }


    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }


    public static ArrayList<Integer> fillArray(int fillingNumber, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, fillingNumber);
        }
        return list;
    }


    public static ArrayList<Integer> increaseArrayList(int term, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + term));
        }
        return list;
    }
}
