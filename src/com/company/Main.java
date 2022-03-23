package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] students = {"Cambell", "Nesta", "Cafu", "Maldini", "Rumminiger", "Rashford"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name's student :");
        String input_name = sc.nextLine();
        boolean isExiet = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExiet = true;
                break;
            }
        }
        if (!isExiet) {
            System.out.println("Not found" + input_name + " in the list.");
        }

    }
}
