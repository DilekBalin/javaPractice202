package interviewQuestions2;

import java.util.Scanner;



public class Mysolution1 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */


    /*ALGORITMA:
    once sayinin%10 alirim ki kalani yazdirayim yani ilkk rakam
    ilk rakam haric kalan sayiyi 10 a bolerim ki virgulden sonrasini yazdirayim
    ayni islemi bir daha yaparim ve sondaki rakama ulasirim
    sonra bu rakamlarin kuplerini alacagiz
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" bir sayi giriniz");
        int sayi = scanner.nextInt();
        armstrog(sayi);//parametreli bir method create ettik
        girilenSayiyaKadar(sayi);
    }


    private static void armstrog(int n) {
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = n;
        //girilen sayi 0 dan buyuk oldugu surece islem yap while dongusu

        while (n > 0) {   //girilen sayi 0 dan buyuk oldugu surece
            basamaktakiSayi = n % 10;  //sayinin %10 u ilk rakami verecek
            sayininKupleriToplami = sayininKupleriToplami + (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            n = n/ 10; //her seferinde 10 a bolersem virgulden sonrasini atar cunku integer oldudgu icin

            //burdaki default degerleri kullanmak icin yazdim
        }

        if (girilenSayi == sayininKupleriToplami)
            System.out.println(girilenSayi + " armstrong sayidir");

        else System.out.println(girilenSayi + " armstrong sayi degildir");
        System.out.println("********************** ");
    }

    //soru 2 icin
    private static void girilenSayiyaKadar(int sayi ) {  //for loopa ihtiyacim var cunku girilen sayiya kadar demis
        for (int i= 1;i<=sayi;i++){
            armstrog(i); //recursive method uyguladik
            //girilen sayilarin armstrong olup olmamasini yukaridaki method ta test etmistik
            //bu yuzden sil bastan yapmak yerine varolan o methodu cagirdik
            //bu durumda once 56/satir calsirir ve 34.satira gider
        }

        }
    }
