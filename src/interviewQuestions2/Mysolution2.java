package interviewQuestions2;

import java.util.Scanner;

public class Mysolution2 {
     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
      */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
       String strSayi = scan.next(); //
        //bana herbir rakam lazim
        // string yapmamin sebebi split le sayilari paracalayabilmek
        armstrogMethod(strSayi);

    }

    private static void armstrogMethod(String strSayi) {
        String basamak[]= strSayi.split("");  //sayilari ayirdik bouylece
        int toplam=0;   //basamaklar boyunca ilerleyecegim icin bi for dongusune ihtiyacim var
        for (int i=0;i<basamak.length;i++) {
            toplam+= Math.pow(Integer.valueOf(basamak[i]),basamak.length);

        }
 if (Integer.valueOf(strSayi)==toplam)
     System.out.println("bu bir armstrong sayidir");
 else  System.out.println("bu bir armstrong sayi degildir");
    }

}

