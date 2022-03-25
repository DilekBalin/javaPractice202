package practice_basic_day01;

import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen notunuzu giriniz:");
        double not = scanner.nextDouble();

        if (not < 0 || not > 100) {
            System.out.println("Lufen dogru sayı girdiginizden emin olunuz");
        } else if (not < 60) {
            System.out.println("Notunuz : 'F'");
        } else if (not < 70) {
            System.out.println("Notunuz : 'D'");
        } else if (not < 80) {
            System.out.println("Notunuz : 'C'");
        } else if (not < 90) {
            System.out.println("Notunuz : 'B'");
        } else {
            System.out.println("Notunuz : 'A'");

        }
    }
}