package Day02;

import java.util.Scanner;

public class C2_Scanner {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //         dikdortgenin alanini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kenar1*kenar2);
    }
}
