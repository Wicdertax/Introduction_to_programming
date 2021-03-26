package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 25 MARCH 2021
//DESCRIPTION: This software calculate the cost of the package
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        int v_location, v_kilos, v_total_package = 0;
        for (int i=1;i<=10;i=i+1){
            System.out.println("------Package "+i+"------");
            System.out.println("Where do you want to send the package?");
            System.out.println("The prices in dollar for each location are these");
            System.out.println("1) North America: $11");
            System.out.println("2) Central America: $10");
            System.out.println("3) South America: $12");
            System.out.println("4) Europe: $24");
            System.out.println("5) Asia: $27");
            System.out.println("Enter only the number that you can see at left of the location ");
            v_location = keyboard.nextInt();
            while (v_location<=0||v_location>=6) {
                System.err.println("ERR: The location can't be less than 1 and greater than 5, please input again the location");
                System.out.println("------Package "+i+"------");
                System.out.println("The prices in dollar for each location are these");
                System.out.println("1) North America: $11");
                System.out.println("2) Central America: $10");
                System.out.println("3) South America: $12");
                System.out.println("4) Europe: $24");
                System.out.println("5) Asia: $27");
                System.out.println("Enter only the number that you can see at left of the location ");
                v_location = keyboard.nextInt();
            }
            System.out.println("How many kilograms does the package weigh?");
            v_kilos = keyboard.nextInt();
            while (v_kilos<0){
                System.err.println("The kilos can't be less tha zero, please input again the kilos");
                v_kilos = keyboard.nextInt();
            }
            if (v_location==1){
                v_total_package=v_total_package+11*v_kilos;
            }
            if (v_location==2){
                v_total_package=v_total_package+10*v_kilos;
            }
            if (v_location==3){
                v_total_package=v_total_package+12*v_kilos;
            }
            if (v_location==4){
                v_total_package=v_total_package+24*v_kilos;
            }
            if (v_location==5){
                v_total_package=v_total_package+27*v_kilos;
            }
            System.out.println("The total price in dollars are: $USD "+v_total_package);
        }

    }
    public static void p_show_info_program(){
        System.out.println("---------------------------------");
        System.out.println("Softpackage V1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 23 MARCH 2021");
        System.out.println("---------------------------------");
    }

}
