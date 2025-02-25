package kz.kaznu.amir.HW7;

public class ExceptionConstructor {
    public static int exceptionsOfArray (String[][] array) throws AppArrayDataException, AppArraySizeException {
        var sum = 0;
        if (array.length !=4) {throw new AppArraySizeException("Размер массива должен быть равным 4");}
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {throw new AppArraySizeException("Размер элемента массива должен быть равным 4");}
            for (int j = 0; j < 4; j++) {
               try {
                   sum += Integer.parseInt(array[i][j]);
               }
               catch (NumberFormatException ex) {
                   throw new AppArrayDataException("Неверный тип данных в элементе массива: " + array[i][j]);
               }
            }
        }
        return sum;
    }
}
