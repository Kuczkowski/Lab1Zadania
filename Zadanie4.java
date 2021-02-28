package com.company;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Program ten sprawdza czy podane boki tworza trojkat.");
        System.out.println("Pierwszy bok:");
        int a=scan.nextInt();
        System.out.println("Drugi bok:");
        int b=scan.nextInt();
        System.out.println("Trzeci bok:");
        int c=scan.nextInt();
        if ((a+b>c)&&(a+c>b)&&(b+c>a))   System.out.println("Z podanych boków może powstać trójkąt.");
        else            System.out.println("Z podanych boków nie może powstać trójkąt.");
    }
}