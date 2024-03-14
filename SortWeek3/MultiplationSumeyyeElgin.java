import java.util.Scanner;

public class MultiplationSumeyyeElgin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz: ");
        int number1 = input.nextInt();

        System.out.print("lütfen ikinci sayıyı giriniz: ");
        int number2 = input.nextInt();

        int multi = number1 * number2;

        if (multi == 20) {
            System.out.println("sonucunuz 20'ye eşittir");
        }
    }
}
