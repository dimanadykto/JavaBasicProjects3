package org.example;


public class Task1 {
    public static void main(String[] args) {

        int [] temp = {57, 18, 87, 56, 99, 55, 89};

        int max = temp[0];
        int min = temp[0];

        for(int i : temp) {
            if (i>max) {
                max = i;
            } else if (i<min) {
                min = i;
            }
        }
        System.out.println("Lowest Temp is " + min);
        System.out.println("Highest Temp is " + max);
    }
}