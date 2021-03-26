package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 23 MARCH 2021
//DESCRIPTION: This software calculate time (t=d/v) between two cities
import java.util.Scanner; //Esto es para usar el teclado en el programa
public class Main {

    public static void main(String[] args) {
        p_show_info_program();

        //calculate time = distance/velocity

        float v_time = 0; //la variable v_time es decimal = float / double
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time = v_distance / v_velocity;
        System.out.println("The time between two cities is: " + v_time + "hours");
    }

    public static void p_show_info_program() {
        //DATE: 23 MARCH 2021
        //DESCRIPTION: This method show the software info
        System.out.println("---------------------------------");
        System.out.println("SoftCalculateTime V1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 23 MARCH 2021");
        System.out.println("---------------------------------");

    }

    public static int p_user_distance() {
        //DESCRIPTION: This method returns the distance than user input
        Scanner keyboard = new Scanner(System.in); //Use la variable keyboard como instancia para el teclado
        System.out.println("Input the distance (Km) between two cities");
        int v_distance = keyboard.nextInt();//se pide por teclado la variable de la distancia
        while (v_distance < 0) {
            System.err.println("ERR: The distance should be greater than zero, please input again the distance (km/h)");
            v_distance = keyboard.nextInt();//no se necesita poner int de nuevo
        }
        return v_distance;
    }

    public static int p_user_velocity() {
        //DESCRIPTION: This method returns the velocity than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the contance velocity (Km/h) between two cities:");
        int v_velocity = keyboard.nextInt();
        while (v_velocity == 0) {// Dos igual es comparar, solo uno es asignar un valor a una variable
            System.err.println("ERR: The velocity can't be same than zero, please input again the velocity (Km/h");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}