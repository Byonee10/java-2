/*
 * Kullanıcıdan başlangıç ve bitiş değeri olarak 
 * pozitif sayılar alın. Bu iki değer arasındaki 
 * tüm sayıların toplamını yazdırmak için bir Java 
 * programı yazın. Eğer bitiş değeri başlangıç değerinden
 *  küçükse, bir uyarı yazdırın ve işlemi sonlandırın.

 */
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Başlangıç değeri giriniz:");
        int start = scanner.nextInt();
        System.out.println("Bitiş değeri giriniz:");
        int end = scanner.nextInt();
        
        int toplam = 0;
        for(int i = start;i<=end;i++){
            toplam += i;
        }
        System.out.println("Toplam="+toplam);
        scanner.close();

}
}