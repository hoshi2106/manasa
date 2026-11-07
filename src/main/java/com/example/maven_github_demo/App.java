package com.example.maven_github_demo;

import java.util.Scanner;

public class App {

    public static String getGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = scanner.nextDouble();

        System.out.println("Grade: " + getGrade(score));

        scanner.close();
    }
}