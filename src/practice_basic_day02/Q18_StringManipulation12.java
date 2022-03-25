package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {


    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Isteginiz seyi istediginiz sekilde yazin:");
        String str = scanner.nextLine();
        int boslukSayisi= str.indexOf(" ");

        if (boslukSayisi==-1) {
            System.out.println("bosluk yoktur");
        }else {
            System.out.println("bosluk vardır");
        }




        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
        System.out.print("Bir ifade giriniz:");
        String str1 = scanner.nextLine();
        if (str1.isEmpty()){
            System.out.println("hicbir sey yazılmamıs,bos");
        }else{
            System.out.println("ici bos degil");
        }


        }
    }

   /* String str = scan.nextLine();
        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())) {
        System.out.println("bosluk yoktur");

    } else {
        System.out.println("bosluk vardir");



    

    */