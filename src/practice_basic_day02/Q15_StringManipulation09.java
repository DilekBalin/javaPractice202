package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz");
        String kelime= scanner.next();
        char ortancaKarakter = kelime.charAt((kelime.length()-1)/2);

        if ((kelime.length()%2!=0) && (kelime.length()>=3)) {
            System.out.println(ortancaKarakter);
        }else{
            System.out.println("Sozcuk 3 harften az oldugu icin yeniden yazın");
        }



    }
}