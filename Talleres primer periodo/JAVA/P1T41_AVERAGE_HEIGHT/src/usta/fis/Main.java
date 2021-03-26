package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon, Jhoan Sebastian Cardenas Bravo
//DATE: 26 MARCH 2021
//DESCRIPTION: Parcial primer corte
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        int v_kids, v_average=0;
    for (int i=1;i<=5;i=i+1){
        System.out.println("Please input the height of kid number:"+i);
        v_kids = keyboard.nextInt();
        while (v_kids<50||v_kids>200) {//The symbols (||) is an or, we already knew how to do this process
            System.err.println("ERR: The height can't be less than 50 and greater than 200, please input again the height of kid number " + i);
            v_kids = keyboard.nextInt();
        }

    v_average=v_average+v_kids/5;//This is the average
    }
    System.out.println("The average of height is "+v_average);
    }
    public static void p_show_info_program() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("SoftCalculateHeight V1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon, Jhoan Sebastian Cardenas Bravo");
        System.out.println("Date: 26 MARCH 2021");
        System.out.println("-----------------------------------------------------------------");
    }

}
