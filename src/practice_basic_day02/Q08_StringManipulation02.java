package practice_basic_day02;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

String kelime1="Guzel";
String kelime2="Olacak";
       String birlestir= kelime1.substring(1).concat(" "+kelime2.substring(1));

        System.out.println("yan yana:"+birlestir);

    }
}
