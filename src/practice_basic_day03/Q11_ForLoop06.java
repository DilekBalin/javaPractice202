package practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06 {
    public static void main(String[] args) {
        /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

        int satir = 3;
        int sutun = 5;

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}