
/*
random kullanılarak girilen 20
elemanlı bir dizideki en küçük elemanı ve o elemana
ait indisi bulup konsolda gösteren Java programını
yazınız. daha sonra da bu elemanları kucukten buyuge sıralayarak yazdırınız.
 */

import java.util.Arrays;

public class odev1 {
    public static void main(String[] args){
        int[] dizi= new int[20] ;
        for(int i=0; i<dizi.length; i++){
           dizi[i]=(int) (Math.random()*101);
        }

        //dizi de ki elemanları yazdıralım.
        for(int d:dizi){
            System.out.print(d+", ");
        }
        System.out.println();
        
        int m=0;
        int en_kucuk=dizi[0];
        for(int k=0; k<dizi.length; k++){
            if(en_kucuk>dizi[k]){
                en_kucuk=dizi[k];
                m=k;
            }
        }
    System.out.println("dızıde kı en kucuk deger= " + en_kucuk);
    System.out.println("en kucuk sayının ındisi= " + m);
    
    Arrays.sort(dizi);
    System.out.println("dizi elemanlarının küçükten büyüğe sıralaması");
    for(int n:dizi){
        System.out.print(n+", ");
    }

    }
}
