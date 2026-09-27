package com.college;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "sita");

        System.out.println("Student Management Application");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Display Name: " + student.getDisplayName());
    }
}