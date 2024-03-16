import java.util.Scanner;
public class YagizZorluIsimSoyisim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gerekliIsim = "Yağız";
        String gerekliSoyisim = "Zorlu";

        System.out.println("İsim giriniz :");
        String isim = sc.nextLine();

        System.out.println("Soyisim giriniz :");
        String soyisim = sc.nextLine();

        if(isim.equals(gerekliIsim) && soyisim.equals(gerekliSoyisim)) {
            System.out.println("Hoş geldin Yağız Zorlu");
        } else {
            System.out.println("Yanlış kişi.");
        }
    }
}
