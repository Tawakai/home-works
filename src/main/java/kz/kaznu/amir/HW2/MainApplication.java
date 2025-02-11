package kz.kaznu.amir.HW2;
import java.util.Arrays;

public class MainApplication {
    public static void printSentence (int count, String sentence) {
        for (int i = 0; i < count; i++) {
            System.out.println(sentence);
        }
    }

    public static void sumOf5 (int[] array5) {
        int sum = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5 [i] > 5) {
                sum += array5 [i];
            }

        }
        System.out.println(sum);
    }

    public static void fillArr (int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr [i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void plusChislo (int chislo, int[] arr){
            for (int i = 0; i < arr.length; i++) {
                arr[i] += chislo;
            }
        System.out.println(Arrays.toString(arr));
        }

    public static void compareHalf (int[] arr) {
        int mid = arr.length/2;
        int sumhalf1 = 0;
        int sumhalf2 = 0;
        int sumofall = 0;
        for (int i = 0; i < mid; i++) {
            sumhalf1 += arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            sumofall += arr[i];

        }
        sumhalf2 = sumofall - sumhalf1;
        if (sumhalf1 > sumhalf2) {
            System.out.println("первая половина больше");
        }
        else if (sumhalf2 > sumhalf1) {
            System.out.println("вторая половина больше");
        }
        else {
            System.out.println("половины равны");
        }
    }


    public static void main(String[] args) {
        printSentence(5, "Hello");
        int[] array = {1, 2, 2, 1};
        int[] arrFill = {1, 2, 3, 4, 5};
        sumOf5(array);
        fillArr(4, arrFill);
        plusChislo(4, array);
        compareHalf(array);



    }

}

