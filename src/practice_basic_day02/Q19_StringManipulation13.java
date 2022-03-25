package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen dort harfli birkelime giriniz");
        String kelime= scanner.next().toLowerCase().trim();
        System.out.println(""+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));
    }

    }

