package org.example;

public class Task8 {
    public static void main(String[] args) {

        int [] num = {15,86,48,86,12,96};

        int least = num[0];
        int most = num[0];

        for (int i : num) {
            if (i>most) {
                most = i;
            } else if (i<least) {
                least = i;
            }
        }
        System.out.println("Biggest number is " + most);
        System.out.println("Smallest number is " + least);
    }
}
