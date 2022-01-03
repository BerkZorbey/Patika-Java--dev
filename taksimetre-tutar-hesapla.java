import java.util.Scanner;




public class Deneme {
    public static void main(String[] args) {
        int km,acılısUcretı=10;
        double odeme,tutar,perKM = 2.20;
        Scanner inp =new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        km= inp.nextInt();
        tutar=acılısUcretı+(perKM*km);
        odeme = tutar<20.0 ? 20:tutar;

        System.out.println("Taksimetre Tutarı: "+odeme);

        
    }
}
