package com.company;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperature podana w stopniach Celsjusza a program przekonwertuje je na Fahrenheity:");
        int stopnie = scan.nextInt();
        double Fh=(double)9/5*stopnie+32;
        System.out.println(Fh);
    }
}