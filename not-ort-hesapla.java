import java.util.Scanner;




public class Deneme {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp =new Scanner(System.in);



        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double ort = toplam/6;

        System.out.println(ort>60 ? "Sınıfı Geçti":"Sınıfta Kaldı");




    }
}
