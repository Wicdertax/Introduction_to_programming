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
        System.out.println("Input the number 3 if you want to multiply");
        System.out.println("Input the number 4 if you want to difference");
        System.out.println("Input the number 5 if you want to close the program");
        System.out.println("--------------------------------------");
        int v_selection = keyboard.nextInt();
        while (v_selection<=0 || v_selection>=6) {
            System.err.println("ERR: The number of the selection can't be less than 1 and greater than 2, please put the selection number again ");
            v_selection = keyboard.nextInt();
        }
        if (v_selection == 1) {
            p_sum();
        }
        if (v_selection == 2) {
            p_subtract();
        }
        if (v_selection == 3) {
            p_multi();
        }
        if (v_selection == 4) {
            p_difference();
        }

    }
    public static void p_show_info(){
        System.out.println("---------------------------------");
        System.out.println("      Basic Calculator V1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("       Date: 15 April 2021");
        System.out.println("---------------------------------");
    }
    public static double p_sum() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the first value that you want to sum");
        double v_sum_user_1 = keyboard.nextInt();
        System.out.println("Please put the second value that you want to sum");
        double v_sum_user_2 = keyboard.nextInt();
        double v_result_sum = v_sum_user_1 + v_sum_user_2;
        System.out.println(" The total sum is " + v_result_sum);
        return v_result_sum;
    }

    public static double p_subtract() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the first value that you want to subtract");
        double v_subtract_user_1 = keyboard.nextInt();
        System.out.println("Please put the second value that you want to subtract");
        double v_subtract_user_2 = keyboard.nextInt();
        double v_result_subtract = v_subtract_user_1 - v_subtract_user_2;
        System.out.println(" The total rest is " + v_result_subtract);
        return v_result_subtract;
    }

    public static double p_multi() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the first value that you want to multiply");
        double v_multi_user_1 = keyboard.nextInt();
        System.out.println("Please put the second value that you want to multiply");
        double v_multi_user_2 = keyboard.nextInt();
        double v_result_multi = v_multi_user_1 * v_multi_user_2;
        System.out.println(" The total rest is " + v_result_multi);
        return v_result_multi;
    }
    public static double p_difference() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please put the valor of the numerator");
        double v_difference_user_1 = keyboard.nextInt();
        System.out.println("Please put the valor of the denominator");
        double v_difference_user_2 = keyboard.nextInt();
        double v_result_difference = v_difference_user_1 / v_difference_user_2;
        System.out.println(" The total rest is " + v_result_difference);
        return v_result_difference;
    }
}