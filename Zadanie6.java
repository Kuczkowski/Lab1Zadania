package com.company;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        {
            System.out.println("Podaj 3 liczby do posortowania: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int[] tab = {a,b,c};
            int i, j, temp;

            for (i = 0; i < tab.length - 1; i++){
                for (j = 0; j < tab.length - 1; j++){
                    if(tab[j] < tab[j + 1]){
                        temp = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = temp;
                    } } }
            System.out.println("Posortowane liczby: ");
            for(i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
        } } }