package org.example;

public class Task9 {
    public static void main(String[] args) {

        int [] main = {15,88,56,38,48,62};

        int a = 0;
        int b = 0;

        for (int i = 0; i < main.length; i++) {
            if (main[i] > a) {
                b = a;
                a = main[i];
            } else if (a > main[i] && main[i] > b) {
                b = main[i];
            }
        }
        System.out.println("The second largest number in this array is " + b);

    }
}
