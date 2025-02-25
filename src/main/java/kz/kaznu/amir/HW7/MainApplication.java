package kz.kaznu.amir.HW7;

public class MainApplication {
    public static void main(String[] args) {
        exampleGood();
        exampleBadSize();
        exampleBadData();
    }


    public static void exampleGood() {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10","11", "12"}, {"13", "14", "15", "16"}};

        try {
            int answer = ExceptionConstructor.exceptionsOfArray(array);
            System.out.println("Сумма элементов массива = " + answer); }

        catch (AppArraySizeException ex) {
            System.out.println("Error" + ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }


    public static void exampleBadSize() {
        String[][] array = {{"5", "6", "7", "8"}, {"9", "10","11", "12"}, {"13", "14", "15", "16"}};

        try {
            int answer = ExceptionConstructor.exceptionsOfArray(array);
            System.out.println("Сумма элементов массива = " + answer); }

        catch (AppArraySizeException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

public static void exampleBadData () {
    String[][] array = {{"mistake", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10","11", "12"}, {"13", "14", "15", "16"}};

    try {
        int answer = ExceptionConstructor.exceptionsOfArray(array);
        System.out.println("Сумма элементов массива = " + answer); }

    catch (AppArraySizeException ex) {
        System.out.println("Error" + ex.getMessage());
    } catch (AppArrayDataException ex) {
        System.out.println("Error" + ex.getMessage());
    }

}

}
