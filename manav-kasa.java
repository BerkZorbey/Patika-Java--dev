import java.util.Scanner;


public class Deneme {
    public static void main(String[] args) {
        int armut_kg,elma_kg,domates_kg,muz_kg,patlican_kg;
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,tutar;
        Scanner inp =new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? ");
        armut_kg= inp.nextInt();
        System.out.println("Elma Kaç Kilo ? ");
        elma_kg= inp.nextInt();
        System.out.println("Domates Kaç Kilo ? ");
        domates_kg= inp.nextInt();
        System.out.println("Muz Kaç Kilo ? ");
        muz_kg= inp.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? ");
        patlican_kg= inp.nextInt();
        tutar=(armut_kg*armut)+(elma_kg*elma)+(domates_kg*domates)+(muz_kg*muz)+(patlican_kg*patlican);

        System.out.println("Toplam Tutar: "+tutar+" TL");




    }
}
