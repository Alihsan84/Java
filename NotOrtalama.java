import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        int mat,fzk,trk,kmy,mzk,ders=0;
        double avrg,toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat=input.nextInt();
        if(mat>=0 && mat<=100) {
            toplam+=mat;
        }
        ders++;

        System.out.println("Fizik Notunuzu Giriniz: ");
        fzk=input.nextInt();
        if(fzk>=0 && fzk<=100) {
            toplam+=fzk;
        }
        ders++;

        System.out.println("Türkçe Notunuzu Giriniz: ");
        trk=input.nextInt();
        if(trk>=0 && trk<=100) {
            toplam+=trk;
        }
        ders++;

        System.out.println("Kimya Notunuzu Giriniz: ");
        kmy=input.nextInt();
        if(kmy>=0 && kmy<=100) {
            toplam+=kmy;
        }
        ders++;

        System.out.println("Müzik Notunuzu Giriniz: ");
        mzk=input.nextInt();
        if(mzk>=0 && mzk<=100) {
            toplam+=mzk;
        }
        ders++;

        avrg = toplam/ders;

        if(avrg>=55){
            System.out.println("Sınıfı Geçtiniz. Tebrikler");
        }else{
            System.out.println("Sınıfı Geçemediniz!");
        }

        System.out.println("Ortalamanız: "+avrg);

    }
}
