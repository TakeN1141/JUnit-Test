package Homework08;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        StudentData students = new StudentData();
        System.out.println("Lambda interface test function:");
        students.testStudentInterface();
        System.out.println("Choose 1(descending sort) or 2(ascending)");

        Scanner chooseSort = new Scanner(System.in);
        byte numberChoose = chooseSort.nextByte();
        if (numberChoose == 1){
            System.out.println("Your choice is descending order sortiment");
            students.testSortingData();
            System.out.println(" ");

        }
        if (numberChoose == 2){
            System.out.println("Your choice is ascending order sortiment");
            students.testSortingDataAscending();
            System.out.println(" ");
        }
    }
}