package interwievQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupSolution01 {
    public static void main(String[] args) {
          /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle kelime giriniz : ");
        String str=scan.nextLine();
        String arr[]=str.split("");


        Map<String, Integer> kelimeMap=new HashMap<>();
        for (String w:arr) {
            if(kelimeMap.containsKey(w))//varsa key
                kelimeMap.put(w,kelimeMap.get(w)+1);//artir
            else kelimeMap.put(w,1);
        }
        System.out.println(kelimeMap);
    }
}
