package usta.fis;

public class Main {

    public static void main(String[] args) {
	int []p_arrays_or_vector=new int[3];
	int counter=0;
	int p_total=0;

	p_arrays_or_vector[0]=4;
    p_arrays_or_vector[1]=5;
    p_arrays_or_vector[2]=2;

    for (counter=0;counter<p_arrays_or_vector.length;counter++){
        System.out.println("Su calificación del corte "+(counter+1)+" es: "+p_arrays_or_vector[counter]);
    }
    }
}
