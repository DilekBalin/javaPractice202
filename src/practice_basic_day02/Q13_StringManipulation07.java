package practice_basic_day02;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        String str="x.yz";
        boolean xyzVarMi=false;
        if(str.contains("xyz")){
            System.out.println(xyzVarMi);

        }else{
            System.out.println(xyzVarMi);
        }
    }
}
