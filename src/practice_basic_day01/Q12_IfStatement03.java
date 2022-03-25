package practice_basic_day01;


import java.util.Locale;
import java.util.Scanner;

public class Q12_IfStatement03 {
    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen is unvanınızı qa/dev/ba/pm seklinde girin:");
        String jobTitle = scanner.next().toLowerCase();



        if (jobTitle.equals("qa")) {
            System.out.println("Your job is: Quality Analyst");

        } else if (jobTitle.equals("dev")) {
            System.out.println("Your job is: Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Your job is: Business Analyst");
        } else if (jobTitle.equals("pm")) {
            System.out.println("Your job is: Project Manager");
        }else{
            System.out.println("Please check in your answer");
        }



    switch (jobTitle){
        case "qa":
            System.out.println("Your job is: Quality Analyst");break;

        case "dev":
            System.out.println("Your job is: Developer");break;

        case "ba":
            System.out.println("Your job is: Business Analyst");break;

        case "pm":
            System.out.println("Your job is: Project Manager");break;
        default:
            System.out.println("Please check in your answer");


    }

    }

}

















