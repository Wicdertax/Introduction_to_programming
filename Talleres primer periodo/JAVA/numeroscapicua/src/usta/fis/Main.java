package usta.fis;

import java.util.Scanner;

public class Main {
    //Hacer un programa que lea los numeros de un arreglo y compruebe si el numero digitado es capicua o no.
    //Metodo aparte para verificación del numero
    public static void main(String[] args) {
        int[] array_capicua;
        int counter2=0;
        int size, counter = 0, grade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the size for single array");
        size = keyboard.nextInt();
        array_capicua = new int[size];
        System.out.println("-------------------------------------------------");
        System.out.println("Please input the numbers that you know the average");
        while (counter < array_capicua.length) {
            System.out.println("Please input the " + (counter + 1) + " grade:");
            grade = keyboard.nextInt();
            array_capicua[counter] = grade;
            counter++;//i=i+1;
            System.out.println("-------------------------------------------------");
        }
        for (int i = 0; i < array_capicua.length; i++) {
            System.out.println("The number is: "+ array_capicua[i] +" and ");
            if (p_validation_capicua(array_capicua, counter2)){
                System.out.println("Es capicua");
            }else{
                System.out.println("No es  capicua");
            }

        }
    }
    public static boolean p_validation_capicua(int[]array_capicua, int counter2){
        while(counter2<array_capicua.length) {
            String v_capicua = String.valueOf(array_capicua[counter2]);
            for (int i = 0, j=v_capicua.length()-1; i <=j ; i++,j--) {
                if(v_capicua.charAt(i) != v_capicua.charAt(j)){
                    return false;
                }
            }
            counter2++;
        }return true;
        }
}
