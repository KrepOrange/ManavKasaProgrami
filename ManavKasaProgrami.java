import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        //variable
        Scanner kgFruit = new Scanner(System.in);
        double armutPerKg = 2.14, elmaPerKg = 3.67, domatesPerKg = 1.11, muzPerKg = 0.95, patlicanPerKg = 5;
        double tutar = 0;

        System.out.print("Kaç kg armut? --");
        tutar +=  (armutPerKg * kgFruit.nextDouble());

        System.out.print("Kaç kg elma? --");
        tutar +=  (elmaPerKg * kgFruit.nextDouble());

        System.out.print("Kaç kg domates? --");
        tutar +=  (domatesPerKg * kgFruit.nextDouble());

        System.out.print("Kaç kg muz? --");
        tutar +=  (muzPerKg * kgFruit.nextDouble());

        System.out.print("Kaç kg patlıcan? --");
        tutar +=  (patlicanPerKg * kgFruit.nextDouble());

        System.out.println("Toplam tutar " + tutar + " TL'dir.");
    }
}
