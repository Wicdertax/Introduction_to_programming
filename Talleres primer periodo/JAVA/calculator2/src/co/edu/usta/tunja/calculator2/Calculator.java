package co.edu.usta.tunja.calculator2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){ //parametro unidemensional de tipo String
        int v_number_one, v_number_two=0,operationToDo; //result no es necesario
        String v_result;
        Scanner keyboard = new Scanner(System.in);

        programInfo();
        System.out.println("Please input the arithmetic operation that you want: 1) To add, 2) To subtract, 3) To multiply, 4) To divide, 5) To validate prime number");
        operationToDo = keyboard.nextInt();
        while(operationToDo<0 || operationToDo>5){
            System.err.println("The operation can't be less than 0 and greater than 5, please input the arithmetic operation that you want: 1) To add, 2) To subtract, 3) To multiply, 4) To divide, 5) To validate prime number");
            operationToDo = keyboard.nextInt();
        }
        if (operationToDo!=5) {
            System.out.println("Please input the first number");
            v_number_one = keyboard.nextInt();
            System.out.println("Please input the second number");
            v_number_two = keyboard.nextInt();
            while (operationToDo == 4 && v_number_two == 0) {
                System.err.println("The number two can't be 0 if you divide, please input again the number two");
                v_number_two = keyboard.nextInt();
            }
            v_result=operationCalculate( v_number_one,v_number_two,operationToDo);
            System.out.println("The result is: "+v_result);
        }
        if (operationToDo==5){
            System.out.println("Please input the number");
            v_number_one = keyboard.nextInt();
            v_result=operationCalculate( v_number_one,v_number_two,operationToDo);
            System.out.println("The number "+v_result);
        }
    }
    public static String operationCalculate (int v_number_one, int v_number_two, int v_operation){
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
        public static boolean p_validate_prime(int v_number_one){
            int numbers_divide=0;
            for(int i=1;i<=v_number_one;i++){
                if(v_number_one%i==0){
                    numbers_divide++;
                }
            }
            if(numbers_divide!=2){
                return false;
            }
            return true;
        }
    public static void programInfo (){
        System.out.println("---------------------------------");
        System.out.println("Calculator2 v 1.0");
        System.out.println("Maker: Juan Sebastian Leal Pinzon");
        System.out.println("Date: 7 May 2021");
        System.out.println("---------------------------------");
    }
}
