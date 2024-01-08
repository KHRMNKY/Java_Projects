//giriş degerlerı 2,3,4,5,0 girilmiş varsayılacakmış. burdan max degerı bulacagız.

import java.util.Scanner;
public class odev4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int number=sc.nextInt();
        int max=number;

        for(int i=0; i<5; i++){
            System.out.println("lütfen bir giriş degerlerını giriniz");
            int nm=sc.nextInt();
            if (nm>max){
                max=nm;
            }
            
        }
        System.out.println("max degerınızı= " + max);
    }
}
