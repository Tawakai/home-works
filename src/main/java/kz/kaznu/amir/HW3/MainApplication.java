package kz.kaznu.amir.HW3;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void squareStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую длину стороны квадрата:");
        int size = scanner.nextInt();
        char arr[][] = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = '*';
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }

        }
        return sum;

    }
    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]>max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static int secondStringSum(int[][] array) {
        int sumof2str = 0;
        if (array.length >= 2) {
            for (int j = 0; j <array.length; j++) {
                sumof2str += array[2][j];
            }
        }
        else {
            System.out.println("-1");
        }
        return sumof2str;
    }
    public static void nullDiag (int[][] array) {
        System.out.println("Заданный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println(" ");

        }
        System.out.println("С обнуленными диагоналями:");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - 1 - i] = 0;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main (String[] args) {
        int[][] array = {{2, -10, 11}, {7, 5, -2},  {5, 8, 8} };
        System.out.println("Сумма положительных элементов массива:" + sumOfPositiveElements(array));
        System.out.println("Наибольший элемент = " + findMax(array));
        System.out.println("Сумма элементов второй строки = " + secondStringSum(array));
        squareStar();
        nullDiag(array);



    }
}
