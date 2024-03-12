public class YagizZorluDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Sayı : " + i);
            i--;
        } while(i>0);      //do komutundan dolayı 1'i bir kere yazdırır.

        int x = 0;
        do {
            System.out.println("Sayı " + (x+1) + ": " + x);
            x++;
        } while(x<=100);
    }
}
