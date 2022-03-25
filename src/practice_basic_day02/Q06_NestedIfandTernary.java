package practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {

        int sayi = 9;

        if (sayi < 0 || sayi > 9) {
            System.out.println("Gecersiz");
        } else if (sayi == 0) {
            System.out.println("sifir");
        } else if (sayi == 1) {
            System.out.println("bir");
        } else if (sayi == 2) {
            System.out.println("iki");
        } else if (sayi == 3) {
            System.out.println("uc");
        } else if (sayi == 4) {
            System.out.println("dort");
        } else if (sayi == 5) {
            System.out.println("bes");
        } else if (sayi == 6) {
            System.out.println("alti");
        } else if (sayi == 7) {
            System.out.println("yedi");
        } else if (sayi == 8) {
            System.out.println("sekiz");
        } else {
            System.out.println("dokuz");

        }




        int n=10;
        String sonuc  = n==0 ? "sifir":n==1 ? "bir":n==2 ? "iki":n==3 ? "uc":n==4 ? "dort"
                : n==5 ? "bes":n==6 ? "alti": n==7 ? "yedi"
                :n==8 ? "sekiz":n==9 ? "dokuz":"gecersiz";
        System.out.println(sonuc);

    }
}

