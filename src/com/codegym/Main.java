package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] students = {"Ruby", "Weiss", "Blake", "Yang", "Jauhn", "Pyrha", "Nora", "Ren", "Winter", "Yatsuhashi"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name: ");
    String input_name = scanner.nextLine();
    boolean isExist = false;
    for (int i = 0; i < students.length; i++){
        if (students[i].equals(input_name)){
            System.out.println("Học sinh "+students[i]+ " ở vị trí thứ "+(i+1));
            isExist = true;
            break;
        }
    }
    if (!isExist)
        System.out.println("Học sinh "+input_name+" không có trong danh sách");
    }
}
