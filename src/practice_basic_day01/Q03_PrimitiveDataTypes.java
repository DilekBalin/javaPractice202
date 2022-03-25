package practice_basic_day01;

public class  Q03_PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMax = Byte.MAX_VALUE; //Wrapper class'tan geldi sonuc
        System.out.println("byteMax = " + byteMax); //soutv yazınca Java ustteki her seyi value 'su ile beraber  yazdirir
        //cunku Java hafızasına aldıgı en son seyi yazdırır

        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);

        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);


        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        long longMax = Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);

        double doubleMin = Double.MIN_VALUE;
        System.out.println("doubleMin = " + doubleMin);

        double doubleMax = Double.MAX_VALUE;
        System.out.println("doubleMax = " + doubleMax);

        float floatMin = Float.MIN_VALUE;
        System.out.println("floatMin = " + floatMin);


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float  laptopFiyat = 9999.99F;  //esitlik oncesi declaration    //esitlik sonrasi assign yani atama
        double kilometre =579.6;
        char cinsiyet = 'E';
        boolean dogruMu =true;

         System.out.println(laptopFiyat);
         System.out.println("laptopFiyat = " + laptopFiyat); //soutv yazinca bu sekilde cikiyor
         System.out.println(kilometre);
         System.out.println("dogruMu = " + dogruMu);
         System.out.println(cinsiyet);
         System.out.println(dogruMu);

       //bunları toplu yoruma almak istersek kursor satırın basındayken alt'a basıp asagı dogru cekeriz
        /*
        coklu yorum satiri
         */

        // System.out.println(laptopFiyat +  kilometre +  cinsiyet +  dogruMu);
        //bu sekilde yazdırmaz cunku farkli data type'larla aynı islemi yapamaz. //concat da yapamaz

        System.out.println(laptopFiyat +"," + kilometre + "," + cinsiyet + "," + dogruMu);
        //bunu kabul etti cunku aralarina bosluk bıraktık ve virgullerle de ayırdık
        //bu sekilde concatination'u engellemis olduk
    }

}
