package co.edu.usta.tunja.array.bidimensional.v2;

import javax.swing.*;

public class Bidimensional {
    public static void main(String[] args){
        int [][] matrix;
        int value;
        String columns, rows, input;
        JOptionPane.showMessageDialog(null, "This program create dynamic bidimensional array");
        rows = JOptionPane.showInputDialog("Please input the size of rows");
        while(Integer.parseInt(rows)<=0){
            System.err.println("The number can't be less than 0, please input again the size of rows");
            rows = JOptionPane.showInputDialog("Please input the size of rows");
        }
        columns = JOptionPane.showInputDialog("Please input the size of columns");
        while(Integer.parseInt(rows)<=0) {
            System.err.println("The number can't be less than 0, please input again the size of columns");
            columns = JOptionPane.showInputDialog("Please input the size of columns");
        }
        matrix = new int[Integer.parseInt(rows)][Integer.parseInt(columns)];
        JOptionPane.showMessageDialog(null,"Please input the values "+
                "for the bidimensional array of: "+rows+" rows and: "+columns+" columns.");
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j <Integer.parseInt(columns); j++) {
                input=JOptionPane.showInputDialog("Please input the value array["+i+"]["+j+"]=");
                value=Integer.parseInt(input);
                matrix[i][j]=value;
            }
        }
        JOptionPane.showMessageDialog(null,"The value of bidimensional array are these: ");
        String print = " ";
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                print+=matrix[i][j]+" ";
            }
            print+="\n";
        }
        JOptionPane.showMessageDialog(null, "The values introduced are: "+print);
    }
}
