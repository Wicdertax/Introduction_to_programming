package co.edu.usta.tunja.array.bidimensional;
import javax.swing.*;
import java.util.Scanner;
public class Bidimensional {
    public static void main(String [] args) {
        int filas = 5, columnas = 4;
        Scanner keyboard = new Scanner(System.in);
        int[][] bidimensional_array = new int[filas][columnas];
        JOptionPane.showMessageDialog(null,"Please type the value for the dimensional array");
        System.out.println("Please input the values for the bidimensional array");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("In the position [" + i + "][" + j + "] your value is: ");
                bidimensional_array[i][j] = keyboard.nextInt();
                System.out.println("--------------------------------------------");
            }
        }
        System.out.println("The value of bidimensional array are these: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + bidimensional_array[i][j] + "] ");
                if (bidimensional_array[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println("||||FILA "+i+")");
        }
    }
}
