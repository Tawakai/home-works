package kz.kaznu.amir.HW9;


import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<Integer>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void add(String name, int number) {
        HashSet<Integer> numbers = phoneBook.get(name);
        if (numbers == null) {
            numbers = new HashSet<>();
            phoneBook.put(name, numbers);
        }
        numbers.add(number);
    }


    public HashSet<Integer> find(String name) {
        HashSet<Integer> numbers = phoneBook.getOrDefault(name, null);
        return numbers;
    }


    public boolean containsPhoneNumbers(int number) {
        for (HashSet<Integer> numbers : phoneBook.values()) {
            if (numbers.contains(number)) {
                return true;
            }
        }
        return false;
    }
}
