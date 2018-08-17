package hometask.task2;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("три числа напиши");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int [3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[2]);
        sc.close();
    }
}
