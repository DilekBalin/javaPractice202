package practice_basic_day02;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        String gun="pazar";

        switch (gun){
            case "pazartesi" :
                case "sali":
                    System.out.println("Java gunleri");break;
            case "persembe" :
            case "cuma":
                System.out.println("Seleniım gunleri");break;
            case "carsamba" :
            case "cumartesi":
                System.out.println("SQL gunleri");break;
            case "pazar" :
                System.out.println("izin gunleri");break;

            default:
                System.out.println("hatali giris");


        }














    }
}
