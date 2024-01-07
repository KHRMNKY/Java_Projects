/*
Aşağıdaki matrisin en küçük elemanını ve o elemana ait indisleri
bulup konsolda yazan Java programını yazınız?
 */

public class odev3 {
    public static void main(String[] args) {
        int[][] matris = {
            {100, 20, 300},
            {44, 55, 666},
            {7, 80, 9},
            {10, 11, 12}};
        
        int en_kucuk=matris[0][0];
        int a=0, b=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if((matris[i][j])<en_kucuk){
                    en_kucuk=(matris[i][j]);
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("en kucuk deger "+ en_kucuk);
        System.out.printf("en kucuk degerın ındısı= [%d,%d]'dir", a,b );


}
}