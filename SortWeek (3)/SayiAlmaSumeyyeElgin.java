import java.util.Scanner;

public class SayiAlmaSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen ilk sayıyı giriniz: ");
        int number1 = scan.nextInt();

        System.out.print("lütfen ikinci sayıyı giriniz: ");
        int number2 = scan.nextInt();

        int sum = number1 + number2;

        System.out.println("girdiğiniz sayıların toplamı: " + sum);

    }
}
