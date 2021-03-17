package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 2021-march-16
//DESCRIPTION: This software show variable than input by keyboard

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("SOFT_INPUT_NUMBER version 1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("---------------------------");
        Scanner keyboard=new Scanner(System.in);
        int v_number1, v_number2, v_sum;
        System.out.println("Imput the first number:");
        v_number1=keyboard.nextInt();
        System.out.println("Imput the second number:");
        v_number2=keyboard.nextInt();
        v_sum=v_number1+v_number2;
        System.out.println("The sum is"+v_sum);
        System.out.println("Software completed successfully");
    }
}
