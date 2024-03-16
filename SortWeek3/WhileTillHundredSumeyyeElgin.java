public class WhileTillHundredSumeyyeElgin {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i++);
            //i++ bu işlem için olabilir ancak ismini veya bir string yazdıracakken kod
            //bloğunda i değişkenini arttıracak bir komut olayacağı için kod sonsuz döngüye girer

            System.out.println(i);
            i++;
        }
    }
}
