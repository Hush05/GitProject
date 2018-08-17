package hometask.task2;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String output = (name.length() > 10) ? "tl;dr" : "Hello " + name + '!';
        System.out.println(output);
    }
}
