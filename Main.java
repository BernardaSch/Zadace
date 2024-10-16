/*Traziti unos velicine polja u koje korisnik kasnije unosi
vrijednosti pojedinog elementa polja. Potrebno je ispisati
maximalnu vrijednost elementa polja.
Npr, 3 je velicina polja te je korisnik unjeo 1,3,5. Program
treba pronaci najvecu vrijednost te u obom slucaju ispisati 5.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int velicinaPolja = 0;

        System.out.println("Unesite velicinu polja: ");
        velicinaPolja = sc.nextInt();
        int polje[] = new int[velicinaPolja];

        for (int i=0; i<velicinaPolja; i++){
            System.out.println("Unesite vrijednosti za " + (i+1) + ". polje: ");
            polje[i] = sc.nextInt();
        }

        int maxBroj = polje[0];

        for (int i=0; i<velicinaPolja; i++){
            if (polje[i]>= maxBroj){
                maxBroj = polje[i];
            }
        }
        System.out.println("Najveca vrijednost je: " + maxBroj);
    }
}