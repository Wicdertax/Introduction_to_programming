package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 25 MARCH 2021
//DESCRIPTION: Take 3 sources an arrays
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
        System.out.println("Please input the number of times that do you want to input a number");
        int v_user = keyboard.nextInt();
        while(v_user<=0){
            System.err.println("THE NUMBER CAN'T BE LESS THAN ZERO, PLEASE INPUT AGAIN THE NUMBER OF REPETITIONS");
            v_user = keyboard.nextInt();
        }
        double[]v_numbers=new double[v_user];
        for(int i=0;i<v_user;i++){
            System.out.println(" Please input the number "+i);
            v_numbers[i]=keyboard.nextDouble();
        }
        p_sum_and_average(v_numbers,v_user);
    }
    public static void p_show_info_program(){
        System.out.println("---------------------------------");
        System.out.println("Arreglos v 1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 25 April 2021");
        System.out.println("---------------------------------");
    }
    public static void p_sum_and_average(double[] v_numbers, int v_user){
        double v_sum=0;
        System.out.println("The grades of semester are ");
        for (int counter_print=0;counter_print<v_numbers.length;counter_print++){
            System.out.println("In the cut "+(counter_print+1)+"=["+v_numbers[counter_print]+"]");
            v_sum=v_sum+v_numbers[counter_print];
        }
        for (int counter_print=0;counter_print<v_numbers.length;counter_print++) {
            System.out.println("-----------------------------------");
           if (counter_print==0){
               System.out.println("The value of grade is: "+v_numbers[counter_print]*0.1);
           }
            if (counter_print==1){
                System.out.println("The value of grade is: "+v_numbers[counter_print]*0.3);
            }
            if (counter_print>=2){
                System.out.println("The value of grade is: "+v_numbers[counter_print]*(0.6/(v_numbers.length-2)));
            }
        }
        System.out.println("----------------");
        System.out.println("The average is: ");
        System.out.println(v_sum/v_user);
        System.out.println("----------------");
    }
}
