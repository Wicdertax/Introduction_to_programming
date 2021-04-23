package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 25 MARCH 2021
//DESCRIPTION: This program calculate 2 numbers in sum, rest, multiply or difference
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int v_number_one=0,v_number_two,v_operation;
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
		while (v_operation <= -1 || v_operation >= 6) {
			System.err.println("The number can't be less than 0 and greater than 5, please input again a number between 0 and 5");
			System.err.println("Please input 1 to sum, 2 to subtract, 3 multiply, 4 division, 5 prime number or not prime number, o exit");
			v_operation = keyboard.nextInt();
		}
		if (v_operation != 5) {
			System.out.println("---------------------------");
			System.out.println("     Basic Calculator");
			System.out.println("---------------------------");
			System.out.println("Please input the number one");
			v_number_one = keyboard.nextInt();
			System.out.println("Please input the number two");
			v_number_two = keyboard.nextInt();
			System.out.println("The result of the operation is " + p_operate_numbers(v_number_one, v_number_two, v_operation));
		} else {
			System.out.println("The number " + p_validate_prime(v_number_one));
		}
	} while (v_operation != 0);

    }
    public static void p_show_info_program(){
		System.out.println("╔════════════════════════════════════╗");
		System.out.println("║  Basic Calculator simplified V1.0  ║");
		System.out.println("║  Maker: Juan Sebastian Leal Pinzon ║");
		System.out.println("║         Date: 15 April 2021        ║");
		System.out.println("╚════════════════════════════════════╝");
	}
	public static String p_operate_numbers(int v_number_one,int v_number_two,int v_operation){
		Scanner keyboard = new Scanner(System.in);
		int v_result=0;
		String v_result_save, v_convert="";
    	while(v_operation<=-1 || v_operation>5) {
    		System.err.println("The value can't be less than one and greater than 5, please input again 1 to sum, 2 to subtract, 3 multiply, 4 division");
			v_operation = keyboard.nextInt();
		}
		switch(v_operation) { //En este método se elige la operación que se quiera hacer
			case 1:
				 v_result = v_number_one + v_number_two;
				 v_result_save = Integer.toString(v_result);
				return v_result_save;
			case 2:
				v_result = v_number_one - v_number_two;
				v_result_save = Integer.toString(v_result);
				return v_result_save;
			case 3:
				v_result = v_number_one * v_number_two;
				v_result_save = Integer.toString(v_result);
				return v_result_save;

			case 4:
				v_result = v_number_one / v_number_two; //operación
				v_result_save = Integer.toString(v_result); //Pasar de int a String
				return v_result_save;

			case 5:
				 v_convert= "Is not a prime number";
				if (p_validate_prime(v_number_one)){
					v_convert="Is a prime number";
				}
				break;
			default:
				 v_convert="Exit";
				 System.exit(0);
		}
    	if(v_convert.isEmpty()){
    		v_convert=String.valueOf(v_result);
		}
    	return v_convert;
	}

	public static String p_prime_number(int v_prime){
    	String prime_numbers="";
    	for(int counter=1; counter<= v_prime;counter++){
    		if(p_validate_prime(counter)){
    			prime_numbers=prime_numbers+String.valueOf(counter)+", ";
			}
		}
    	return prime_numbers;
	}
	public static boolean p_validate_prime(int v_prime){
    	int numbers_divide=0;
    	for (int i=1;i<=v_prime;i++){
    		if (v_prime%i==0){
    			numbers_divide++;
			}
		}
    	if(numbers_divide!=2){
    		return false;
		}
    	return true;
	}
}


