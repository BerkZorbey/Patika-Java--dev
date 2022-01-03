import java.util.Scanner;


public class Deneme {
    public static void main(String[] args) {
        int a,b,c;
        double alan,u;
        Scanner inp =new Scanner(System.in);
        System.out.println("Üçgenin 1.kenarını giriniz: ");
        a= inp.nextInt();
        System.out.println("Üçgenin 2.kenarını giriniz: ");
        b= inp.nextInt();
        System.out.println("Üçgenin 3.kenarını giriniz: ");
        c= inp.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));


        System.out.println("Üçgenin alanı: "+alan);




    }
}
