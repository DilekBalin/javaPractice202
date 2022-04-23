package interwievQuestions1;

import java.util.Arrays;
import java.util.Scanner;

public class Mysolution1 {
    public static void main(String[] args) {
         /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.

    //ALGORITMA:
    //kullanici scanner ,string alin sout
    //bunu array ve splitle yapicaz
     //arrayden gelen harfleri siralayalim Arrays.sort
     //herbir karaktere bakacagiz ve for
     //esitse diyecegimiz icin if
     //sayac lazim esitse artiracagiz
     //esit degilse yazdiracagim

     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

Scanner scan =new Scanner(System.in);
        System.out.println("Bir string giriniz=");
        String str=scan.next();

        String arr[]=str.split(""); //data taypi string olan bir array olusturduk ve split ile herbir karakteri ayirdik
        Arrays.sort(arr);  // adi arr olan arrayi siralacunku tek seferde bir karakteri yazdirmak istiyoruz

        int counter=0;   //sanki karakter yokmus gibi sifirdan aldik
        for (int i = 1; i < arr.length; i++){ //herbir karakteri birbiri ile karsilastircagiz ve
            //eger esit harfler varsa bir kez yazdiracagiz
            if(arr[i-1].equals(arr[i])){ // //en son karakterde sorun yasamamak icin counteri i-1 den baslattik
                //ve yukarida da i =1 oldugu icin aslinda i yine ilk karakterle 2.sini karsilastiracak
                counter++;  //ayni oanlar icin counter artirdi

            }else{
                System.out.println(arr[i]+"sayisi "+ (counter+1));  //+1 dedik cunku eksik saymasin diye
                counter=0;    //yaptim ki digerleri icin sayarken en basa alsin

        }

if (i==arr.length-1){ //en sona geldiginde artik  o karakteri yazabilirsin

    System.out.println(arr[i]+ " sayisi "+ (counter+1));



        }}}}

