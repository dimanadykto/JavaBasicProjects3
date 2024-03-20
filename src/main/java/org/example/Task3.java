package org.example;

public class Task3 {
    public static void main(String[] args) {

        int [][] num = {
                {125,55,98,18},
                {89,45,85,76},
                {25,66,39,46}
        };

        for(int r = 0; r < 2; r++) {
            for(int c = 0; c < 4; c++) {
                if(num[r][c]%2==0) {
                    System.out.println(num[r][c] + " ");
                }
            }
            System.out.println();
        }

    }
}
