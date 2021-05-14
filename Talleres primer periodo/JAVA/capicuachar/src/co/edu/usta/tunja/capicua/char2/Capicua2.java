package co.edu.usta.tunja.capicua.char2;

import java.util.Scanner;

public class Capicua2 {
    public static void main(String[] args){
        //Numéricos: Reales(int), imaginarios(float)
        //Caráteres: Carácter (char), cadena(String)
        Scanner keyboard= new Scanner(System.in);
        String cadena="",resultString="";
        int counter=0;//i
                System.out.println("This program show info about capicua letters or numbers");
        cadena=keyboard.next();
        capicua_Method(cadena);
        resultString=capicuaAnswer(cadena);
    }
    public static boolean capicua_Method(String cadena){
        char[]chararray;
        chararray=new char[cadena.length()];
        chararray=cadena.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i]==chararray[chararray.length-(i+1)]){
                    return false;
            }
        }
        return true;
    }
    public static String capicuaAnswer(String cadena){
        if (capicua_Method(cadena)){
            return "IS capicua";
        }else{
           return "IS Not capicua";
        }
    }
}
