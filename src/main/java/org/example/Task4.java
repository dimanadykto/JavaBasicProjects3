package org.example;

public class Task4 {
    public static void main(String[] args) {

        int [][] num = {
                {1,5,7,2},
                {2,6,7,4},
                {5,8,9,4}
        };

        int even = 0;
        int odd = 0;

        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 4; c++) {
                if(num[r][c]%2==0) {
                    even += num[r][c];
                } else {
                    odd += num[r][c];
                }
            }
        }
        System.out.println("The sum of even numbers is " + even);
        System.out.println("The sum of odd numbers is " + odd);
    }
}
