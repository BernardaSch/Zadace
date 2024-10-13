/*Zadatak 3: Unos brojeva dok ne postignemo određeni zbroj
Napiši program koji traži unos brojeva od korisnika sve dok zbroj
svih unesenih brojeva ne dostigne ili prijeđe unaprijed definirani ciljni zbroj.
Ako korisnik unese negativan broj, program ga ignorira i traži novi unos.
Ako korisnik unese 0, prekida unos i program ispisuje trenutni zbroj.
Kada se zbroj dostigne ili premaši, program završava i ispisuje
koliko je pokušaja korisnik napravio i konačni zbroj.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxBroj = 20;
        int uneseniBroj = 1;
        int zbroj = 0;
        int brojac = 0;
        while(zbroj < maxBroj){
            System.out.println("Unesite pozitivan broj: ");
            uneseniBroj = sc.nextInt();
            if (uneseniBroj>0){
                zbroj = zbroj+uneseniBroj ;
                brojac = brojac + 1;
            }
            else if (uneseniBroj<0){
                System.out.println("Ne možete unijeti negativan broj.");
            }
            else {
                System.out.println("Unijeli ste nulu. Program se prekida.");
                break;
            }
        }
        System.out.println("Zbroj unsesenih brojeva iznosi: " + zbroj);
        System.out.println("Broj uspješnih pokušaja: " + brojac);
    }
}