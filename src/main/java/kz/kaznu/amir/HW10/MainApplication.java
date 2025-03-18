package kz.kaznu.amir.HW10;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.*;


public class MainApplication {
    public static void main(String[] args) {
        File directory = new File("/Users/tawakai/dev/Java/Basic/home-works/src/main/java/kz/kaznu/amir/HW10");
        for (File file : directory.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Содержимое какого файла вы бы хотели увидеть?");
        String chosenFile = scanner.nextLine();
        File file = new File(chosenFile);
        try (FileInputStream in = new FileInputStream("/Users/tawakai/dev/Java/Basic/home-works/src/main/java/kz/kaznu/amir/HW10/"+file)) {
            byte[] buf = new byte[64];
            int n = in.read(buf);
            while (n>0) {
                System.out.println(new String(buf, 0, n));
                n = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Что вы бы хотели записать в данный файл?");
        String data = scanner.nextLine();
        try (FileOutputStream out = new FileOutputStream("/Users/tawakai/dev/Java/Basic/home-works/src/main/java/kz/kaznu/amir/HW10/"+file, true)) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
