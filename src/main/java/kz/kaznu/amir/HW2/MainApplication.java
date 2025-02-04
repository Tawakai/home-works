package kz.kaznu.amir.HW2;
import java.util.Scanner;
import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scm1 = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scm1.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner scm11 = new Scanner(System.in);
            System.out.println("Введите элемент массива:");
            arr1 [i] = scm11.nextInt();
            if (arr1 [i] > 5) {
                sum += arr1 [i];
            }
        }
        System.out.println("Ваш массив");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Сумма элементов больших 5:");
        System.out.println(sum);
        Scanner plus = new Scanner(System.in);
        System.out.println("На какое число вы бы хотели увеличить каждый элемент массива?");
        int chislo = plus.nextInt();
        for (int m = 0; m < size; m++) {
            arr1 [m] += chislo;
        }
        System.out.println(Arrays.toString(arr1));
        int[] half1;
        int[] half2;
        if (size%2==0) {
            half1 = new int[size/2];
            half2 = new int[size/2]; }
        else {
            half1 = new int[size/2 + 1];
            half2 = new int[size/2 + 1];
        }
        for (int k = 0; k <=size/2 ; k++) {
            half1 [k] = arr1 [k] - chislo;

        }
        for (int j = 0; j <= size/2; j++) {
            half2 [j] = arr1 [size - 1 - j] - chislo;

        }
        System.out.println("Первая половина массива:");
        System.out.println(Arrays.toString(half1));
        System.out.println("Вторая половина массива:");
        System.out.println(Arrays.toString(half2));
        int sumhalf1 = 0;
        int sumhalf2 = 0;
        for (int l = 0; l <= size/2; l++) {
            sumhalf1 += half1[l];
            sumhalf2 += half2[l];


        }
        if (sumhalf1>sumhalf2) {
            System.out.println("Первая половина больше");

        }
        else if (sumhalf2>sumhalf1) {
            System.out.println("Вторая половина больше");

        }
        else {
            System.out.println("Половины равны");
        }
    }

}

