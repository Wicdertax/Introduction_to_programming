package co.edu.usta.tunja.array.single;

import java.util.Scanner;

public class SingleArrayV2 {
    public static void main(String[] args){
        int [] mySingArray;
        int size,counter=0, grade, sumatory;
        float averageResult;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the size for single array");
        size = keyboard.nextInt();
        mySingArray = new int[size];
        System.out.println("-------------------------------------------------");
        System.out.println("Please input the grades that you know the average");
        while(counter<mySingArray.length){
            System.out.println("Please input the "+(counter+1)+" grade:");
            grade= keyboard.nextInt();
            mySingArray[counter]=grade;
            counter++;//i=i+1;
            System.out.println("-------------------------------------------------");
        }
        for (int i = 0; i < mySingArray.length; i++) {
            System.out.println("The grade "+(i+1)+" is: "+mySingArray[i]+", ");
        }
        System.out.println("--------------------------------------");
        sumatory=p_sumatoria(mySingArray);
        System.out.println("The total sum are: "+sumatory);
        System.out.println("--------------------------------------");
        averageResult=p_calculate_average(mySingArray,p_sumatoria(mySingArray));
        System.out.println("You average grades are: "+averageResult);
        System.out.println("--------------------------------------");
    }
    public static int p_sumatoria(int [] mySingleArray){
        int counter_2=0,sum=0;
        while(counter_2<mySingleArray.length) {
            sum = sum + mySingleArray[counter_2];
            counter_2++;
        }
        return sum;
    }
    public static float p_calculate_average(int [] mySingleArray, int sum){
        float average;

        average=sum/mySingleArray.length;
        return average;
    }
}
//Hacer un sub-programa-método-función que haga la sumatoria de todas las notas
//MOstar todas las notas digitadas, separadas por ", "
//MOstrar sumatoria y promedio