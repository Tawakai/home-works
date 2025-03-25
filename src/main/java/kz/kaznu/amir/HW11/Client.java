package kz.kaznu.amir.HW11;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1408);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out, true);
        System.out.println(reader.readLine());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number");
        String firstNumber = scanner.nextLine();
        System.out.println("Type second number");
        String secondNumber = scanner.nextLine();
        System.out.println("Type operation");
        String operation = scanner.nextLine();
        writer.println(firstNumber);
        writer.println(secondNumber);
        writer.println(operation);
        System.out.println(reader.readLine());
        socket.close();
    }
}
