package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    public static void main(String[] args) {


    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("yapacaginiz dort islemi * + - / olarak seciniz :");
        char islem = scan.next().charAt(0);

        System.out.print("birinci sayi :");
        double num1 = scan.nextDouble();
        System.out.print("ikinci sayi :");
        double num2 = scan.nextDouble();

        hesapMakinesi(islem, num1, num2);
    }

    public static void hesapMakinesi(char islem, double num1, double num2) {
        if(islem=='+' || islem=='-' || islem=='*' || islem=='/'){
            switch (islem) {
                case '+':
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case '/':
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case '*':
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;

                //    default:
                //        System.out.println("hatali islem girisi");
            }

        }else System.out.println("hatali giris");
    }

}
