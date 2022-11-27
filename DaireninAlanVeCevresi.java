import java.util.Scanner;

public class DaireninAlanVeCevresi {
    public static void main(String[] args) {
        int r,acı;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r=input.nextInt();
        System.out.print("Daire Dilmimin Açısını Giriniz : ");
        acı=input.nextInt();

        double Alan = pi*r*r;
        double Cevre = 2*pi*r;
        double DaireDilimAlan=(pi*r*r*acı)/360;

        System.out.println("Dairenin Alanı : "+ Alan);
        System.out.println("Dairenin Çevresi : "+ Cevre);
        System.out.println("Daire Diliminin Alanı : "+DaireDilimAlan);

    }
}
