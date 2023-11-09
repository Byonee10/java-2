/*
Kullanıcıya 100'den başlayarak 1'e kadar olan,
sınırlar dahilinde, 7'ye tam bölünebilen
sayıları yazdırmak için bir Java programı yazın.

 */

public class Solution4 {
    public static void main(String[] args) {
        for(int i = 100;i>=1;i--){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
