package Day09;

public class C12_MethodCreation {

    public static void main(String[] args) {

        String str = "Bak kim gelmis ?";

        str.toUpperCase();

        // method bize bir sonuc donduruyorsa 2 sekilde o sonucu kullanabiliriz

        // sadece o satirda, sonucu gormek istiyorsaniz, kalici bir degisiklik yapmayacakasaniz
        // direk yazdirabiliriz
        System.out.println(str.toLowerCase()); // bak kim gelmis ?

        // veya degisikligin kalici olmasini istiyorsak
        // yeni halini kaydedebiliriz

        String strBuyukharf = str.toUpperCase();

        System.out.println(str); // Bak kim gelmis ?
        System.out.println(strBuyukharf); // BAK KİM GELMİS ?




    }
}
