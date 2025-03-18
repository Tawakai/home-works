package kz.kaznu.amir.HW9;

import java.util.HashMap;

public class MainApplication {
    public static void main(String[] args) {
        test();
    }


    public static void test() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Dima", 8777123);
        phoneBook.add("Dima", 8702123);
        phoneBook.add("Roma", 8777456);
        phoneBook.add("Roma", 8777456);
        System.out.println(phoneBook.containsPhoneNumbers(8777123));
        System.out.println(phoneBook.containsPhoneNumbers(123));
        System.out.println(phoneBook.find("Dima"));
        System.out.println(phoneBook.find("Roma"));
    }
}
