import java.util.*;
public class Bidimensional2 {
    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;

        int[][] bidimensional_array = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("bidimensional_array[" + i + "][" + j + "]= ");
                bidimensional_array[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("Valores introducidos:");
        for (i = 0; i < bidimensional_array.length; i++) {
            for (j = 0; j < bidimensional_array[i].length; j++) {
                System.out.print(bidimensional_array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
