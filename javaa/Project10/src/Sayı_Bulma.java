import java.util.Scanner;
public class Sayı_Bulma{
    public static void main(String[] args){
        int sayi1=(int) (Math.random()*100);
        Scanner sc=new Scanner(System.in);
        System.out.println("0-100 arasinda bir sayi giriniz");
        int sayi=sc.nextInt();
        while(sayi1!=sayi){

            if (sayi<sayi1)
                System.out.println("sayiniz düşük değerde");
            else if(sayi>sayi1)
                System.out.println("sayiniz yuksek degerde");
            else
                System.out.println("tebrikler sayiyi doğru girdiniz. sayi=" +" " +sayi);

            System.out.println("lütfen tekrar deneyiniz");
            sayi=sc.nextInt();

        }
        System.out.println("tebrikler sayiyi doğru girdiniz. sayi="+" "+ sayi);
    }
} 
