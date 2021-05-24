package co.edu.usta.tunja.taller.v1;
import javax.swing.*;
public class Taller_programacion {
    public static void main(String[] args) {
        String [][] matrix;
        int value;
        String salir;
        String columns="4", rows, input;
        JOptionPane.showMessageDialog(null, "Este programa muestra los acientos disponibles, que no se pueden usar, y los que están ocupados");
        rows = JOptionPane.showInputDialog("Ingrese el número de filas");
        while(Integer.parseInt(rows)<=0){
            System.err.println("El número de filas no puede ser menor de cero, por favor introduzca de nuevo el número de filas");
            rows = JOptionPane.showInputDialog("Ingrese el número de filas");
        }
        matrix = new String[Integer.parseInt(rows)][Integer.parseInt(columns)];
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j <Integer.parseInt(columns); j++) {
                if (i%2==0) {
                    System.out.println(matrix[i][j] = "D");
                }
                if(i%2!=0) {
                    System.out.println(matrix[i][j] = "X");
                }
            }
        }
        do {
            JOptionPane.showMessageDialog(null, "Los acientos disponibles se marcan con D y los NO disponibles con X, los ocupados por alguien con O ");
            String print = " ";
            for (int i = 0; i < Integer.parseInt(rows); i++) {
                for (int j = 0; j < Integer.parseInt(columns); j++) {
                    print += matrix[i][j] + " ";
                }
                print += " \n ";
            }
            JOptionPane.showMessageDialog(null, print);

            String aciento_fila;
            String aciento_columna;
            aciento_fila = JOptionPane.showInputDialog(null, "Por favor ingrese la fila a la que quiere sentarse si no está ocupada ");
            aciento_columna = JOptionPane.showInputDialog(null, "Por favor ingrese la columna a la que quiere sentarse si no está ocupada ");
            while (Integer.parseInt(aciento_fila) % 2 != 0 && Integer.parseInt(aciento_columna) % 2 != 0) {
                JOptionPane.showMessageDialog(null, "La silla está ocupada, ingrese de nuevo los valores de fila y columna para sentarse en una silla que NO este ocupada ");
                aciento_fila = JOptionPane.showInputDialog(null, "Por favor ingrese la fila a la que quiere sentarse si no está ocupada ");
                aciento_columna = JOptionPane.showInputDialog(null, "Por favor ingrese la columna a la que quiere sentarse si no está ocupada ");
            }
            for (int i = 0; i < Integer.parseInt(rows); i++) {
                for (int j = 0; j < Integer.parseInt(columns); j++) {
                    matrix[Integer.parseInt(aciento_fila)][Integer.parseInt(aciento_columna)] = "O";
                }
            }
            JOptionPane.showMessageDialog(null, "Los acientos disponibles se marcan con D y los NO disponibles con X, los ocupados por alguien con O ");
            String print_ocuped = " ";
            for (int i = 0; i < Integer.parseInt(rows); i++) {
                for (int j = 0; j < Integer.parseInt(columns); j++) {
                    print_ocuped += matrix[i][j] + " ";
                }
                print_ocuped += " \n ";
            }
            JOptionPane.showMessageDialog(null, print_ocuped);
            salir = JOptionPane.showInputDialog(null, "Si no hay mas pasajeros y quieres cerrar el programa marca -1, sino marca cualquier otro número");
            if (Integer.parseInt(salir) == -1) {
                System.exit(-1);
            }
        }while(Integer.parseInt(salir)!=-1);
        int disponibles = 0, ocupados = 0, no_disponibles = 0;
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                if (matrix[i][j] == "X") {
                    no_disponibles = no_disponibles + 1;
                }
                if (matrix[i][j] == "D") {
                    disponibles = disponibles + 1;
                }
                if (matrix[i][j] == "O") {
                    ocupados = ocupados + 1;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El registro es: Disponibles " + disponibles + " no disponibles: " + no_disponibles + " Ocupados: " + ocupados);
    }
}
