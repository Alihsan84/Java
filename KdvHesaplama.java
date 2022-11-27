import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar=input.nextDouble();
        double kdvTutar=tutar*kdvOran;
        double kdvliTutar=tutar+kdvTutar;
        System.out.println("KDV'siz Fiyat = "+tutar);
        System.out.println("KDV'li Fiyat = "+kdvliTutar);
        System.out.println("Kdv Tutarı = "+kdvTutar);

    }
}
