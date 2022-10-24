package Tests;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        int[] list = new int[5];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            int number = Integer.parseInt(console.nextLine());
            list[i] = number;
        }
        int maxValue = max(list);
        System.out.println(maxValue);
    }

    public static int max(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void printHelloName() {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello, " + name + "");
    }

    public static void math() {
        int q = 21;
        int w = 8;
        System.out.println(q/w + "," + q%w);
    }

    public static void string() {
        String text = "abcde.1234567";
        int index = text.indexOf('.');
        System.out.println(text.substring(index, text.length()-1));
    }
}
