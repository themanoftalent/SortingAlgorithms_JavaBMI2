import java.util.Scanner;

public class MuhammedNebiAltinCarpim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz");
        int num1 = sc.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        int num2 = sc.nextInt();

        int carpim = num1*num2;
        if (carpim == 20){
            System.out.println("Çarpımın Sonucu 20");
        }
        else {
            System.out.println("Çarpımın Sonucu 20 Değil");
        }
    }
}
