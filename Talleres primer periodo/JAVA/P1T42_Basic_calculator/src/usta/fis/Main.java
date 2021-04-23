package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 25 MARCH 2021
//DESCRIPTION: This program calculate 2 numbers in sum, rest, multiply or difference
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int v_number_one=0,v_number_two=0,v_operation;
    p_show_info_program();
    Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please input ");
            System.out.println("1) To sum");
            System.out.println("2) To subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Division");
            System.out.println("5) Prime number or not prime number");
            System.out.println("6) Prime numbers");
            System.out.println("0) Exit");
            v_operation = keyboard.nextInt();
            while(v_operation<0 || v_operation>6){
                System.err.println("The number can´t be less than zero and greater than six, please input again the number");
                System.err.println("Please input ");
                System.err.println("1) To sum");
                System.err.println("2) To subtract");
                System.err.println("3) Multiply");
                System.err.println("4) Division");
                System.err.println("5) Prime number or not prime number");
                System.err.println("6) Prime numbers");
                System.err.println("0) Exit");
                v_operation = keyboard.nextInt();
            }
            if (v_operation!=0) {
                System.out.println("Please input the number one");
                v_number_one = keyboard.nextInt();

                if (v_operation > 0 && v_operation < 5) {
                    System.out.println("Please input the number two");
                    v_number_two = keyboard.nextInt();
                }
            }
            System.out.println("════════════════════════════════════");
            System.out.println("The result is: " + p_operate_numbers(v_number_one, v_number_two, v_operation));
            System.out.println("════════════════════════════════════");
        }while(v_operation!=0);

    }
    public static void p_show_info_program(){
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║  Basic Calculator simplified V1.0  ║");
        System.out.println("║  Maker: Juan Sebastian Leal Pinzon ║");
        System.out.println("║         Date: 15 April 2021        ║");
        System.out.println("╚════════════════════════════════════╝");
    }
    public static String p_operate_numbers(int v_number_one, int v_number_two, int v_operation){
        int v_result=0;
        String v_convert="";
        switch (v_operation) {
            case 1 -> v_result = v_number_one + v_number_two;
            case 2 -> v_result = v_number_one - v_number_two;
            case 3 -> v_result = v_number_one * v_number_two;
            case 4 -> v_result = v_number_one / v_number_two;
            case 5 -> {
                v_convert = "Isn't a prime number";
                if (p_validate_prime(v_number_one)) {
                    v_convert = "Is a prime number";
                }
            }
            case 6 -> v_convert = "The prime numbers are: " + p_prime_numbers(v_number_one);
            default -> {
                v_convert = "Exit";
                System.exit(0);
            }
        }
            if (v_convert.isEmpty()){
                v_convert=String.valueOf(v_result);
            }
            return v_convert;
    }
    public static String p_prime_numbers(int v_limit){
        String prime_numbers="";
        int p_pos_counter=0;
        int []int_prime_numbers=new int[100];
        for(int counter=1; counter<= v_limit;counter++){
            if(p_validate_prime(counter)){
                prime_numbers = prime_numbers+String.valueOf(counter)+", ";
                int_prime_numbers[p_pos_counter]=counter;
                p_pos_counter++;
            }
        }
        return prime_numbers;
    }
    public static boolean p_validate_prime(int v_number){
        int numbers_divide=0;
                for(int i=1;i<=v_number;i++){
                    if(v_number%i==0){
                        numbers_divide++;
                    }
                }
                if(numbers_divide!=2){
                    return false;
                }
            return true;
    }
}

