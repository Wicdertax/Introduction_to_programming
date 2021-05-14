package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int []array=new int[10];
	Scanner keyboard = new Scanner(System.in);
	int digit=0, counter=0;

	System.out.println("Please input a number to verify if it is capicua, input -1 to finish the series");
	do{
	    System.out.println("");
	    digit= keyboard.nextInt();
	    array[counter]=digit;
	    counter++;
    }while(digit!=-1);
	counter--;
	if (verifyCapicua(array,counter)){
	    System.out.println("Is a capicua number");
	    System.out.println("La suma de los extremos del numeros capicua es: "+sum_capicupa(array));
    }else{
        System.out.println("Is not a capicua number");
    }
    }
    public static boolean verifyCapicua(int [] array, int size){
        for (int i=0;i<size;i++){
            if (array[size-(i+1)]!=array[i]){
                return false;
            }
        }
        return true;
    }
    public static int sum_capicupa(int []array){
        int v_sum = 0;
        v_sum+=array[0]+array[1]+array[array.length]
System.out.println(array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]+", ");
    return v_sum;
    }
}
