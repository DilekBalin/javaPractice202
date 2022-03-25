package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {
        int age = 20;


        if (age >= 18) {
            System.out.println("yas oy kullanmaya uygundur");
            if (age >= 18 && age < 50) {
                System.out.println("bir kez oy kullanabilir");
            } else if (age >= 50 && age < 70) {
                System.out.println("iki kez oy kullanabilir");
            } else {
                System.out.println("uc kez oy kullanabilir");
            }


        } else if (age>0 && age<18){
            System.out.println("yas 18'den kucuk oldugu icin oy kullanamaz");
        }else {
            System.out.println("hatalı giris yaptınız");
        }
    }
}

