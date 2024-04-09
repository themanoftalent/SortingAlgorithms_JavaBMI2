import java.util.Scanner;

public class MuhammedNebiAltinNameSurname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Muhammed";
        String surname = "Altın";

        System.out.println("İsminizi Giriniz");
        String nameIn = sc.nextLine();
        System.out.println("Soyadınızı Giriniz");
        String surnameIn = sc.nextLine();

        if (nameIn.equals(name) && surnameIn.equals(surname)){
            System.out.println("Hoş Geldiniz " + name + " " + surname);
        }
        else{
            System.out.println("Hatalı Giriş");
        }
    }

}
