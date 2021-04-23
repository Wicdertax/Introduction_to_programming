package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int v_number_one;
        while (true) {
            System.out.println("Input a number positive");
            v_number_one = lector.nextInt();
            if(v_number_one>0){
                System.out.println("Correct");
                for (int i = 2; i <= v_number_one; i++) {
                    int divisible = 2;
                    boolean v_prime = true;
                    while (v_prime && divisible < i) {
                        if (i%divisible == 0) {
                            v_prime = false;
                        }
                        else {
                            divisible++;
                        }
                    }
                    if (v_prime) {
                        System.out.println(i+" Is a Prime number");
                    }
                }
                {break;}
            }
            else{
                System.out.println("The number can't be less than zero, please input again the number");
                v_number_one = lector.nextInt();
            }
        }
    }
}
