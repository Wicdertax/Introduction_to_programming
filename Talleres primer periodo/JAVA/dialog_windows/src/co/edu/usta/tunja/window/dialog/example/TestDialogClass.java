package co.edu.usta.tunja.window.dialog.example;
import javax.swing.*;
import java.util.Scanner;

public class TestDialogClass {
    public static void main(String []args){
        // JOptionPane.showMessageDialog(null, "Proceso finalizado");
        //JOptionPane.showMessageDialog(null, "Proceso finalizado","Info",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Mensaje de alerta o peligro", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Mensaje de Error Con pregunta", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Mensaje de pregunta", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Plain messaje", "Plain message", JOptionPane.PLAIN_MESSAGE);
        //ImageIcon icono = new ImageIcon("resources/parentesisIcono.png");
        //JOptionPane.showMessageDialog(null, "Cuadro de diálogo personalizado ", "Título personalizado", JOptionPane.INFORMATION_MESSAGE, icono);
        String answer;
        int amount, operation, result;
        int number_one=0, number_2=0;
        int [] array;
        answer=JOptionPane.showInputDialog("""
                Hi,this program is a calculator,\s
                 and do it a arithmetic operations,\s
                 please type the amount of numbers that you will use""");
        amount= Integer.parseInt(answer);
        answer=JOptionPane.showInputDialog("Please input: \n 1 to sum \n 2 to subtract \n 3 yo multiply \n 4 to divide \n or 0 to exit");
        operation=Integer.parseInt(answer);
        array=new int[amount];
        if(operation!=4) {
            for (int i = 0; i < amount; i++) {
                answer = JOptionPane.showInputDialog("Please input the " + (i + 1) + " number");
                array[i] = Integer.parseInt(answer);
            }
        }
        result = p_calculator(array,operation);
        JOptionPane.showMessageDialog(null, "YOUR RESULT IS: "+result,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
    public static int p_calculator(int[] array, int operation){
        int v_result = 0;
        String v_convert="";
        if (operation==1){
            for (int j : array) {
                v_result = v_result + j;
            }
            return v_result;
        }
        if (operation==2){
            for (int j : array) {
                v_result = v_result - j;
            }
            return v_result;
        }
        if (operation==3){
            v_result=1;
            for (int i = 0; i < array.length; i++) {
                v_result=v_result*array[i];
            }
            return v_result;
        }
        if (operation==4){
            int count=0;
            v_result = v_result + array[count];
            for (int i = 0; i < array.length ; i++) {
                v_result = v_result/array[i];
                return v_result;
            }
        }else{
            v_convert = "Exit";
            System.exit(0);
        }
        return v_result;
    }
}