package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        //Kullanicidan bir liste uzunlugu ve liste uzunlugu kadar eleman girmesini istiyoruz ve onlar eklenecek add methodu
        //uzunluk 3 ise 3 de eleman girecek yani iki kez sacnner objesi yapacagiz
       // sonunda da tekrarli liste olusturup bunu yazdiran bir method olusturacagiz

        Scanner scan = new Scanner(System.in);
        System.out.print("Olusturmak istediginiz listin uzunlugunu giriniz : ");  //kullaniciya sorduk
        int listUzunluk = scan.nextInt();  //ve gelen girdiyi okuduk



        List<Integer> Olusturulanlist = new ArrayList<>();// liste olusturmam gerek ve integerlardan olusuyor
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz .."); //eleman ekleyecegimiz icin sorduk
        //defalarca eleman girilecegi icin for dongusu
        for (int i = 0; i < listUzunluk; i++){ //0.indexten baslasin girilen inputun uzunlugu kaaar saysin
            //bunlari listeye eklememiz lazim
            Olusturulanlist.add(scan.nextInt());   //kullanicidan her aldigini liste ekle
        }

        //method olusturma
        tekrarliEleman(Olusturulanlist);

    }

    private static void tekrarliEleman(List<Integer> Olusturulanlist) {
        List<Integer>tekrarliList = new ArrayList<>();
        for (int i = 0; i < Olusturulanlist.size(); i++){ //elemanlari aldigim ilk liste
            for (int j = i+1; j <Olusturulanlist.size(); j++){ //diger indexleri karislastiracak
                if(Olusturulanlist.get(i) == Olusturulanlist.get(j) && !tekrarliList.contains(Olusturulanlist.get(i))){
                    tekrarliList.add(Olusturulanlist.get(i));
                }
            }
        }
        System.out.println("tekrarli listenin elemanlari :" + tekrarliList);
    }
}
