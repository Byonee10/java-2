/*
 * Üç basamaklı sayılar içerisinde 23'e 
 * tam bölünebilenleri yanyana, 
 * aralarında bir boşluk olacak şekilde yazdırmak için bir Java programı yazın.

 */

public class Solution2{
    public static void main(String [] args){
        for(int i = 100 ; i<1000;i++){
            if(i%23==0){
                System.out.print(i+" ");
            }
        }
    }
}