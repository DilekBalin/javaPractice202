package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char not='D';
      //  String sonuc=""; //diye de kullanılabilir

        String sonuc= not=='A'?  "Gayet Basarili": not=='B'?  "Basarili": not=='C'?"Ha gayret": "digerleri...";
        System.out.println("sonuc:"+sonuc);




    }
}
