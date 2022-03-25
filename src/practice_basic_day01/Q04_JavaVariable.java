package practice_basic_day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {

        // Initializing Variable  //variable baslangic degeri verme

            int age = 32;    //variable insaa ettik
            int temp = 52;  //variable insaa ettik
        System.out.println(age);
        System.out.println("temp = " + temp);


        // To copy the variable's value
            int myAge= 33;
            int hisAge = age;

        // you can declare multiple variables in the same line
            int year = 2022,   month =3,  day =2; //hepsi aynı data turunde oldugu icin tek satırda declare ettik

        // updating a variable
            year = 2032; // bir daha int yazmaya gerek yok yukarıda demistik cunku


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x; //declare ettik
        int y =20000;  // initialize yaptık y'ye ilk degerini verdik
        x=123; //initialize yaptık yani assigmnetle x' e ilk  degerini verdık
        y= 234; // update yani y'nin degerini baska bir degerle yenden assign ettik

        System.out.println("x = " + x);//123
        System.out.println("y = " + y); // y aldıgı en son degeri yazdırır //234
        System.out.println("x = " + x +  "\ny = "+ y); //boyle de yazabiliriz tek seferde



    }
}
