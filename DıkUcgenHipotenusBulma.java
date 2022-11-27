import java.util.Scanner;

public class DıkUcgenHipotenusBulma {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner veri=new Scanner(System.in);
        System.out.print("1.Kenarı Girin : ");
        a=veri.nextInt();
        System.out.print("2.Kenarı Girin : ");
        b=veri.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+ c);

        double u =(a+b+c)/2;
        double Cevre=2*u;
        double Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Çevre : "+ Cevre);
        System.out.println("Alan : "+ Alan);

    }
}
