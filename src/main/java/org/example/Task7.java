package org.example;

public class Task7 {
    public static void main(String[] args) {

        int count = 10;
        int a = 0;
        int b = 1;

        System.out.println("First " + count + " Fibonacci numbers:");

        for (int i = 0; i < count; i++) {
            int next = a + b;
            System.out.println(a + " ");
            a = b;
            b = next;
        }
    }
}
