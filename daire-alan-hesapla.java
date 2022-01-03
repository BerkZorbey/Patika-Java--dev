import java.util.Scanner;




public class Deneme {
    public static void main(String[] args) {
        int r,a;
        double dairedilimalan,alan,cevre,pi=3.14;
        Scanner inp =new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r= inp.nextInt();
        System.out.println("Dairenin merkezaçısı ölçüsünü giriniz: ");
        a= inp.nextInt();
        cevre=2*pi*r;
        alan=pi*r*r;
        dairedilimalan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Merkez açışı "+a+" olan daire diliminin alanı: "+dairedilimalan);
        


    }
}
