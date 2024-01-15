/*
Soru: olustur isimli bir fonksiyon yazmanız istenmektedir. Bu fonksiyon sayi isimli bir tamsayı değişkenini 
parametre olarak almaktadır. Fonksiyonun parametre olarak aldığı sayi değişkeninin değeri 4 ile 8 arasında 
değişmektedir. Fonksiyon geriye sayi*4 boyutunda iki boyutlu bir diziyi geri döndürmesi istenmektedir.  Örneğin 
sayi değeri olarak 5 ve 6 değerleri parametre olarak gönderilmiş ise geri döndürülecek diziler aşağıdaki gibi 
olmalıdır. 
Not: Tek tek atama kabul edilmemektedir. Döngü kullanılması zorunludur. 

 */


import java.util.Scanner;
public class App {
    Scanner sc=new Scanner(System.in);
    public static void dizi(int sayi){
        int[][] dizi=new int[sayi][4];
        for(int i=0; i<(sayi); i++){
            for(int j=0; j<4; j++){
                dizi[i][j]=(int)((Math.random())*101);
            
            }
        }
        for(int i=0; i<(sayi); i++){
            for(int j=0; j<4; j++){
                System.out.print(dizi[i][j]+ " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) throws Exception {
        dizi(5);
    }
}
