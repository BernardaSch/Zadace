/*Zadatak 1: Brojevi od 1 do N
Napišite program koji će izračunati sumu svih brojeva
 od 1 do N, gdje je N pozitivan cijeli broj unesen od strane korisnika.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj = 0;
        int zbroj = 0;

        do{
            System.out.println("Unesite cijeli pozitivni broj: ");
            broj = sc.nextInt();
        }while (broj<0);

        for(int i = 0; i<= broj; i++){
            zbroj = zbroj + i;
        }
        System.out.println("Zbroj unesenih brojeva je: " + zbroj);
    }
}

