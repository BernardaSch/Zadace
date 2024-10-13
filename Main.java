/*Zadatak 2: Brojanje znamenki broja
Napiši program koji prima cijeli broj od
korisnika i  izračuna broj znamenki unesenog broja.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int broj = 1;
        int brojac = 0;

        System.out.println("Unesite broj: ");
        broj = sc.nextInt();

        while(broj > 0){
            broj = broj/10;
            brojac = brojac+1;
        }
        System.out.println("Broj koji ste unijeli sadrži " + brojac + " znamenki.");
    }
}