package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01 {


    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("dort islem icin + - / * sembollerinden birini seciniz");
        char islem = scanner.next().charAt(0);
        System.out.println("Lutfen iki sayi giriniz");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        hesapMakinasi(islem, num1, num2);


    }

    private static void hesapMakinasi(char islem, double num1, double num2) {

            switch (islem) {
                case '+':
                    System.out.println("toplam:" + num1 + num2);
                    break;
                case '-':
                    System.out.println("fark:" + (num1 - num2));
                    break;
                case '*':
                    System.out.println("carpim:" + num1 * num2);
                    break;
                case '/':
                    System.out.println("bolme:" + num1 / num2);
                    break;
                default:
                    System.out.println("hatali giris");
            }

        }


    }

