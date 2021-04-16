package usta.fis;
//AUTHOR: Juan Sebastian Leal Pinzon
//DATE: 25 MARCH 2021
//DESCRIPTION: This program calculate 2 numbers in sum, rest, multiply or difference
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int v_number_one,v_number_two,v_operation;
	p_show_info_program();
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please input the number one");
	v_number_one = keyboard.nextInt();
	System.out.println("Please input the number two");
	v_number_two = keyboard.nextInt();
	System.out.println("Please input 1 to sum, 2 to subtract, 3 multiply, 4 division");
	v_operation = keyboard.nextInt();
	System.out.println("The result of the operation is "+ p_operate_numbers(v_number_one,v_number_two,v_operation));

    }
    public static void p_show_info_program(){
		System.out.println("---------------------------------");
		System.out.println("Basic Calculator simplified V1.0");
		System.out.println("Maker: Juan Sebastian Leal Pinzon");
		System.out.println("       Date: 15 April 2021");
		System.out.println("---------------------------------");
	}
	public static int p_operate_numbers(int v_number_one,int v_number_two,int v_operation){
		Scanner keyboard = new Scanner(System.in);
    	while(v_operation<=0 || v_operation>=5) {
    		System.err.println("The value can't be less than one and greater than 5, please input again 1 to sum, 2 to subtract, 3 multiply, 4 division");
			v_operation = keyboard.nextInt();
		}
			if (v_operation == 1) {
				return v_number_one + v_number_two;
			}
			if (v_operation == 2) {
				return v_number_one - v_number_two;
			}
			if (v_operation == 3) {
				return v_number_one * v_number_two;
			} else {
				return v_number_one / v_number_two;
			}
	}
}
