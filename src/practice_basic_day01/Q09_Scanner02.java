package practice_basic_day01;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line


    Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz:");
        String isim =scan.nextLine();


        System.out.print("Lutfen memleketinizi yaziniz:");
        String memleket =scan.nextLine();


        System.out.print("Lutfen su na yasadıgınız konumu yaziniz:");
        String konum =scan.nextLine();


        System.out.print("Lutfen yasınızı giriniz:");
        int yas =scan.nextInt();


        System.out.print("Lutfen boyunuzu giriniz:");
        int boy =scan.nextInt();


        System.out.print("yasadiginiz " + konum +" u seviyor musunuz? true/false:");
        boolean seviyorMu = scan.hasNextBoolean();


        System.out.println("isminiz:"+isim);
        System.out.println("memleketiniz:"+memleket);
        System.out.println("memleketiniz:"+ konum);
        System.out.println("yasınız:"+ yas);
        System.out.println("boyunuz:"+ boy);
        System.out.println("yasadiginiz"+' '+ konum + "'u'"+ seviyorMu);

    }

}
