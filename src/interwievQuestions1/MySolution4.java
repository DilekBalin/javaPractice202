package interwievQuestions1;

import java.util.Scanner;

public class MySolution4 {

    //String olan pin kodunuzu kontrol eden bir kod yaziniz


    /*ALGORITMA:
 pin kodumuz bastan belli olmali
 hatali girdiyse hak taninmali
 giris hakki bittiginde bloklancak

  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pin="said12345";
        int girisHakki=3;   //giris sayisi belli oldugu icin while ile cozeriz

        System.out.println("*****Hosgeldiniz******");

        while (true){   // true demek while dongusuu dogru oldugu surece caliscak
            System.out.println("pin kodu giriniz");
            String girilenPin=scanner.nextLine();

            //3 olasilik var:dogru giris,hatali giris ve bloklanma
            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz");
                break;  //donguyu kirdik cunku true olursa surekli doner
            }else{
                System.out.println("yanlis giris yaptiniz");
                girisHakki--;
                System.out.println("kalan giris hakkiniz" +girisHakki);
            }if(girisHakki ==0){
                System.out.println("giris hakkiniz kalmadi,sim kartiniz bloke oldu");
                break;
            }
        }

    }
}
