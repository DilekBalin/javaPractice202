package interwievQuestions1;

import java.util.Scanner;

public class MySolution05 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir cumle giriniz :");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        int sayac = 0;

        int i;
        for (i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println(harf+ " karakteri "+sayac+" kez kullanilmistir");

    }
}
