package Day10;

public class C6_FindingPrimeNumbers {
    public static void main(String[] args) {

        // bir onceki class'da olusturulan method'u kullanarak
        // 3 basamakli sayilardan asal olanlari yazdirin

        for (int i = 100; i <1000 ; i++) {

            if (C5_ReturnIsPrime.asalMiDondur(i)){
                System.out.print(i + " ");
            }
        }

        // 4 basamakli kac tane asal sayi var ?
        System.out.println("");
        int sayac=0;

        for (int i = 1000; i <10000 ; i++) {

            if (C5_ReturnIsPrime.asalMiDondur(i)){
                sayac++;
            }
        }

        System.out.println("4 Basamakli sayilardaki asal sayi adedi : " + sayac);
    }
}
