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
        double[]v_numbers=new double[v_user];
        for(int i=0;i<v_user;i++){
            System.out.println(" Please input the number "+i);
            v_numbers[i]=keyboard.nextDouble();
        }
        p_sum(v_numbers,v_user);
    }
    public static void p_show_info_program(){
        System.out.println("---------------------------------");
        System.out.println("Arreglos v 1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 25 April 2021");
        System.out.println("---------------------------------");
    }
    public static void p_sum(double[] v_numbers, int v_user){
        double acumulado=0;
        System.out.println("The grades of semester are ");
        for (int contador_print=0;contador_print<v_user;contador_print++){
            System.out.println("In the cut "+(contador_print+1)+"=["+v_numbers[contador_print]+"]");
            acumulado=acumulado+v_numbers[contador_print];
        }
        System.out.println("----------------");
        System.out.println("The average is: ");
        System.out.println(acumulado/v_user);
        System.out.println("----------------");
    }
}
