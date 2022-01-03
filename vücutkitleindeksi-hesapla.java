import java.util.Scanner;


public class Deneme {
    public static void main(String[] args) {

        double kilo,boy,vucutkitlei;
        Scanner inp =new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo= inp.nextDouble();
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy= inp.nextDouble();
        vucutkitlei=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vucutkitlei);




    }
}
