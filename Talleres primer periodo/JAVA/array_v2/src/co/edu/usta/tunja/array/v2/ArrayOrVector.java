package co.edu.usta.tunja.array.v2;
import java.util.Scanner;
public class ArrayOrVector {
    public static void main(String[] args){
        int [] arrayV1= new int[5];//arreglo unidimensional de tipo entero
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input 5 values to the array");

        for (int i=0;i< arrayV1.length; i++){
            System.out.println("Please input the value number "+(i+1));
            arrayV1[i]= keyboard.nextInt();
           while(arrayV1[i]%2==0){
               System.err.println("ERR: The number can't be a pair number, please input again the number");
               arrayV1[i]= keyboard.nextInt();
           }
        }
        for (int j : arrayV1) {
            System.out.println("The value is " + j);
        }
    }
}
