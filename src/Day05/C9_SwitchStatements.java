package Day05;

import java.util.Scanner;

public class C9_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicinin girdigi gun numarasina gore
        // gun isimlerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("yanlis gun numarasi");
        }

    }
}
