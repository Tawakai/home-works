package kz.kaznu.amir.HW11;
import java.io.*;
import java.net.*;

public class MainApplication {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(1408);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("SYN+ACK done");
            math(socket);
            socket.close();
        }
    }

    public static void math(Socket socket) throws IOException {
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out, true);
        writer.println("You can use +, -, /,*");
        while (true) {
            String firstNumberAsString = reader.readLine();
            String secondNumberAsString = reader.readLine();
            String operation = reader.readLine();
            int firstNumber = Integer.parseInt(firstNumberAsString);
            int secondNumber = Integer.parseInt(secondNumberAsString);
            int result = 0;
            if (operation.equals("+")) {
                result = firstNumber + secondNumber;
            }
            else if (operation.equals("-")) {
                result = firstNumber - secondNumber;
            }
            else if (operation.equals("*")) {
                result = firstNumber * secondNumber;
            }
            else if (operation.equals("/")) {
                result = firstNumber/ secondNumber;
            }
            writer.println("Result = "+result);
            break;
        }
    }
}
