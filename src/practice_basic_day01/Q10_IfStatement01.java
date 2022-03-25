package practice_basic_day01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Y/N harflerinden birini giriniz:");
        char cevap = scanner.next().charAt(0);

        if (cevap == 'Y' || cevap == 'y') {

            System.out.println("cevabınız: YES");

        } else if ((cevap == 'N' || cevap == 'n')) {
            System.out.println("cevabınız : NO");

        } else {

            System.out.println("Lutfen Y ya da N harflerinden birini girdiginizden emin olun");
        }

    }
}


