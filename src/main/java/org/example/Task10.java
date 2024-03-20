package org.example;

public class Task10 {
    public static void main(String[] args) {

        String [] name = {"Dima","Daniel","Mike","Phil","Aleksey","Mike","Nika"};

        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i].equals(name[j])) {
                    System.out.println(name[j]);
                }
            }
        }
    }
}
