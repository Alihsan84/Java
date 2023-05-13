import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, totalPrice;
        double armutPrice=2.14, elmaPrice=3.67, domatesPrice=1.11, muzPrice=0.95, patlicanPrice=5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        armut = input.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elma = input.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        domates = input.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        muz = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        patlican =input.nextDouble();

        totalPrice = (armut*armutPrice)+(elma*elmaPrice)+(domates*domatesPrice)+(muz*muzPrice)+(patlican*patlicanPrice);

        System.out.println("Toplam Tutar :"+totalPrice);
    }
}
