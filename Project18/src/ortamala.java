/*
 * burda boyut gırıyoruz. ve bu boyut kadar eleman ekliyorsunuz.
 * daha sonra da bu elemanların ortalama degerını buluyoruz.
 * daha sonra da ortalama degerden daha yuksek eleman sayısını buluyoruz.
 */

import java.util.Scanner;

public class ortamala {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("boyutu giriniz= ");
        int b=sc.nextInt();
        double[] boyut=new double[b];
        double Toplam=0;
        int sayac=0;
        for(int i=0; i<boyut.length; i++){
            System.out.printf("%d.elemanın indeksini giriniz= ",i);
            boyut[i]=sc.nextDouble();
            Toplam=Toplam + boyut[i];
            System.out.println("elemanlar toplamı= "+Toplam);

        }
        double ortalama= Toplam/(boyut.length);
        System.out.println("ortalama= "+ortalama);

        for(int j=0; j<boyut.length; j++){
            if(ortalama<boyut[j]){
                sayac++;
        }
    }
    System.out.println("ortalamadan buyuk elemanların sayısı= " + sayac);
    
}
}
