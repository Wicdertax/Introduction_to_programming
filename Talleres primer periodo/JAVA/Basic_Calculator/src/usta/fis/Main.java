package usta.fis;
//Author: Juan Sebastián Leal Pinzón
//Date: 15/04/2021
//Description: This program sum or rest two whole numbers
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the number of selection of the operation that do you want");
        System.out.println("--------------------------------------");
        System.out.println("Input the number 1 if you want to sum");
        System.out.println("Input the number 2 if you want to rest");
        System.out.println("--------------------------------------");
        int v_selection = keyboard.nextInt();
        while (v_selection<=0 || v_selection>=3) {
             System.err.println("ERR: The number of the selection can't be less than 1 and greater than 2, please put the selection number again ");
             v_selection = keyboard.nextInt();
        }
        if (v_selection == 1) {
        p_sum();
        }
        if (v_selection == 2) {
        p_rest();
        }

    }

    public static double p_sum() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the first value that you want to calculate");
        double v_sum_user_1 = keyboard.nextInt();
        System.out.println("Please put the second value that you want to calculate");
        double v_sum_user_2 = keyboard.nextInt();
        double v_result_sum = v_sum_user_1 + v_sum_user_2;
        System.out.println(" The total sum is " + v_result_sum);
        return v_result_sum;
    }

    public static double p_rest() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the first value that you want to calculate");
        double v_rest_user_1 = keyboard.nextInt();
        System.out.println("Please put the second value that you want to calculate");
        double v_rest_user_2 = keyboard.nextInt();
        double v_result_rest = v_rest_user_1 - v_rest_user_2;
        System.out.println(" The total rest is " + v_result_rest);
        return v_result_rest;
    }
    public static void p_show_info(){
        System.out.println("---------------------------------");
        System.out.println("Basic Calculator V1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 15 April 2021");
        System.out.println("---------------------------------");
    }

}