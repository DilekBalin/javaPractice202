package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {


        String str="    Java ogrenmek123 Cok guzel@      ";
        System.out.println(str.trim().replaceAll("\\d","").replaceAll("\\s","x").replaceAll("\\W","").
                replaceAll("x","  ").replaceAll("C","c"));

    }
}
