import java.util.Scanner;

public class AskingNameSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String realName = "sümeyye";

        System.out.print("lütfen isminizi giriniz: ");
        String name = scan.nextLine();

        if (name.equals(realName)) {
            System.out.println("hoşgeldiniz " + name);
        } else {
            System.out.println("your name is different from the system");
        }
    }
}
