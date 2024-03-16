public class YagizZorluWhile1To100 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=100) {
            System.out.println("Sayı " + (i+1) + " : " +  i);

            if(i == 70) {
                System.out.println("Dur");
                break;            //break yerine continue yazarsak 70'den itibaren hep 70 yazdırır.
            }
            i++;
        }
    }
}
