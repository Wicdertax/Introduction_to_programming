package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 25 MARCH 2021
//DESCRIPTION: This software calculate the total money saved in a yeaR
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i=1;i<=12;i=i+1){
            System.out.println("------Month "+i+"------");
            v_total_saved=v_total_saved+p_user_saved_money();
        }
        System.out.println("The total money saved in a year was: $"+v_total_saved);
    }
    public static void p_show_info_program(){
        System.out.println("---------------------------------");
        System.out.println("SoftCalculateTime V1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 23 MARCH 2021");
        System.out.println("---------------------------------");
    }
    public static int p_user_saved_money(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the saved money in the month in COP: $");
        int v_saved_money = keyboard.nextInt();
        while (v_saved_money<0){
            System.err.println("ERR: The saved money can't be less than zero, input again the saved money");
            v_saved_money = keyboard.nextInt();
        }
        return v_saved_money;
    }

}
