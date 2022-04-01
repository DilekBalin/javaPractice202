package interwievQuestions;

import java.util.Scanner;

public class MySolution2 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ALGORITMA:
     * Kullanicidan string  demis scanner
     * yazdirin sout
     * ilk ve son harf string icinden alinacaksa substring daha mantikli
     * kullanicidan alinan sayi demis scan den int
     * neyi return edecek string bi ifadeyi
     * methodumdaki parametreler sayi ve string
     * harfleri kullanirken bir dongumuz olacak  for
     *

     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = scan.nextLine();

        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(ilkSon(str, sayi));

    }

    private static String ilkSon(String str, int sayi) {
        String is = str.substring(0, 1) + str.substring(str.length() - 1);
        String a = "";  //cunku string te atama yapmadan deger guncellenmiyor  bu bizim outputumuz aslinda
        for (int i = 0; i < sayi; i++) {   //kullanicinin girdigi sayiya kadar ve kac tane yazacagimi for soyluyo
            a += is;
        }

        return a;  //dondurecegim sey son guncelledigim deger
    }
}



