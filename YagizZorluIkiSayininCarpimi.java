import java.util.Scanner;
public class YagizZorluIkiSayininCarpimi {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = sc.nextInt();

        int carpim = sayi1 * sayi2;

        if(carpim == 20) {
            System.out.println("Çarpımın sonucu 20 gelmedi.");
        } else {
            System.out.println("İki Sayının Carpimi: " + carpim);
        }
    }
}
