package com.company;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cyfre ktora ma odzwierciedlic dzien tygodnia:");
        int dzien=scan.nextInt();
        switch (dzien) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Jest tylko 7 dni w tygodniu.");
        }
    }}