package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int serie=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the number limit of the series");
        serie = keyboard.nextInt();

        int fibo_array[]= new int[100];
        fibo_array=serie_fibonacci(serie);
        System.out.println("The fibonacci series for the number "+serie+" are: ");
        System.out.println(0);
        for (int i = 0; i < serie; i++) {
            if (fibo_array[i]>0) {
                System.out.println(fibo_array[i]);
            }
        }
    }
    public static int [] serie_fibonacci(int limit){
        int fibo_array[] = new int[100];
        fibo_array[0]=0;
        fibo_array[1]=1;

        for (int i = 1; (fibo_array[i-1] + fibo_array[i]) < limit; i++){
            fibo_array[i+1] = fibo_array[i-1] + fibo_array[i];
        }
        return fibo_array;
    }
    public static void p_show_info_program(){
        System.out.println("---------------------------------");
        System.out.println("Serie Fibonacci v 1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 25 April 2021");
        System.out.println("---------------------------------");
    }
}