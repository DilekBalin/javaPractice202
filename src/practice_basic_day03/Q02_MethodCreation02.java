package practice_basic_day03;

public class Q02_MethodCreation02 {
    public static void main(String[] args) {



/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

 birKereYazdir("aabbcccccddddaaa");

    }

    private static void birKereYazdir(String str) {
        String sonuc="";//String'in default degeri hicliktir

        //Her harfe sırayla gidip bakacagız ve tekrar edenleri yazdırmayacagız
        //yapacagımız islem coklu oldugu oldugu icin surekli harfleri sırayla dolasacagım icin
        //for Loop kullanacagız

        for (int i = 0; i < str.length(); i++) { //0.karaktere git sonun akadar birer artır ve yaz
            if (!sonuc.contains(str.substring(i,i+1))) { //a yı aldım yazdırdım alta gecince bir artırmamı isteyecek
                //ancak burdaki sartta icermiyorsa diyo
                //yani ikinvi defa a yı aldım ve yazdırmak isterken elimde bir a oldugunu gordum
                //ikinci defa yazdırmadım
                //sıradaki harfler icin de aynısnı yaptık

                sonuc+=str.substring(i,i+1); //aldıgın harf listede yoksa ekle
            }
            
        }
        System.out.println(sonuc);
    }
}
