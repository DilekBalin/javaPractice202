package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen isminizi giriniz:");
        String isim=scanner.nextLine();
        System.out.print("lutfen soy isminizi giriniz:");
        String soyIsim=scanner.next();
        String tamIsim= isim.toUpperCase().concat(" "+ soyIsim).toUpperCase();

        System.out.println("tam isim:"+tamIsim);




        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

        String sayi1="01234";
        String sayi2="56789";
        String yanYana=sayi1.concat(" "+ sayi2);
        System.out.println("Bitisik yazım:"+yanYana);
        System.out.println( sayi1+ " "+ sayi2);




    }
}
