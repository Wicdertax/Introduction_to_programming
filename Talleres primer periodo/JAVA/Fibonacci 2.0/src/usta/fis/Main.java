package usta.fis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
        int serie;
        int i=0;
        System.out.println("Please input the number limit of the series");
        serie = keyboard.nextInt();
        int [] fibo_array = new int[100];
        fibo_array = serie_fibonacci(serie);
        System.out.println("The fibonacci series for the number "+serie+" are: ");
        while (fibo_array[i]!=-1) {
          if (fibo_array[i+1]!=-1){
              System.out.print("["+fibo_array[i] + "], ");
          }else{
              System.out.print("["+fibo_array[i] + "].");
          }
          i++;
        }
    }
    public static int [] serie_fibonacci(int serie){
        int i=1;
        int[]fibo_array=new int[100];
        fibo_array[0]=0;
        fibo_array[1]=1;
        while (fibo_array[i+1]+fibo_array[i]<=serie){
            fibo_array[i+1]=fibo_array[i-1]+fibo_array[i];
            fibo_array[i+2]=-1;
            i++;
        }
        return fibo_array;
    }
    public static void p_show_info_program(){
        System.out.println("---------------------------------");
        System.out.println("Serie Fibonacci v 2.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 2 May 2021");
        System.out.println("---------------------------------");
    }
}