package com.company;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args){
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj wspolrzedne a:");
            int ax = scan.nextInt();
            int ay = scan.nextInt();
            System.out.println("Podaj wspolrzedne b:");
            int bx = scan.nextInt();
            int by = scan.nextInt();
            System.out.println("Roznica pomiedzy nimi wynosi:");
            double Obliczenie=Math.sqrt(Math.pow(bx-ax,2)+Math.pow(by-ay,2));
            System.out.println(Obliczenie);
        }}}