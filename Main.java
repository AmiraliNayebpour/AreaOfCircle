package com.company;


import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a simple programme to find the Area of circle!!");
        System.out.println("Please Enter your radius  : ");

        int R = scanner.nextInt();

        float PI_NUMBER = 3.14f;

        float area = (R * 2) * PI_NUMBER;

        System.out.println("Your area is : " + area);


    }
}