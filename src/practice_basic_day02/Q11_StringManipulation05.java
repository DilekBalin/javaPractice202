package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir kelime yaziniz");
        String k1=scanner.next();
        System.out.println("lutfen ikinci kelimeyi yaziniz");
        String k2=scanner.next();
        System.out.println("lutfen ucuncu kelimeyi yaziniz");
        String k3=scanner.next();
        System.out.println("lutfen dorduncu kelimeyi yaziniz");
        String k4=scanner.next();

        System.out.println(k1.substring(0,1).toUpperCase()+k1.substring(1).concat(" ,"+ k2+" "+k3+" "+k4+"."));


    }
}
