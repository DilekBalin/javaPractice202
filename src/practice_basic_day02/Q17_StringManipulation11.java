package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi yaziniz:");
        String isim = scanner.nextLine();

        System.out.print("Lutfen soy isminizi yaziniz:");
        String soyIsim = scanner.nextLine();

        if (isim.length()>soyIsim.length()) {
            System.out.println("isim soy isimden daha uzundur");

        }else if (isim.length()<soyIsim.length()){
            System.out.println("soy isim isimden uzundur");

        }else {
            System.out.println("ikisinin uzunlugu esittir");




    }
}
    }