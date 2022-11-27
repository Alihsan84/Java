import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double boy,endeks;
        int kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu(metre cinsinden) Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextInt();

        endeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz : "+ endeks);

    }
}
