import java.util.Scanner;

/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
 */
public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        double sayi;
        double toplam = 0;
        sayi = yazici.nextInt();
        for (int i = 1; i <= sayi; i++) {
            toplam += 1 / (double)i;
        }
        System.out.println(toplam);

    }
}
