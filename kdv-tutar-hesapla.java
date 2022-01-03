import java.util.Scanner;




public class Deneme {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliFiyat;
        double kdvOranı = 0.18;
        Scanner inp =new Scanner(System.in);
        System.out.println("Ücret Tutarını giriniz: ");
        tutar= inp.nextDouble();
        kdvOranı = (tutar>0 && tutar<1000) ? 0.18 : 0.08;
        kdvTutar=tutar*kdvOranı;
        kdvliFiyat=tutar+kdvTutar;

        System.out.println("KDV'siz Fiyat: "+tutar);
        System.out.println("KDV Oranı: "+kdvOranı);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("KDV'li Fiyat: "+kdvliFiyat);





    }
}
