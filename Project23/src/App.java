/*
Windows işletim sisteminde dosya tam adları noktayla ayrılmış iki bölümden oluşur. 
Birinci bölüm dosya adı, ikinci bölüm dosya uzantısını gösterir. 
Kullanıcıdan "Bir dosya tam adi giriniz: " şeklinde giriş isteyen ve kullanıcının girişine göre dosya adını ve dosya uzantısını alt alta yazdıran programı Java programlama dilinde kodlayınız.
(Örnek-1 dosya tam adı: algoritma.prog.docx için dosya adı: algoritma.prog, dosya uzantısı: docx olmalı)
(Örnek-2 dosya tam adı: merhaba.txt için dosya adı: merhaba, dosya uzantısı: txt olmalı)
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen dosya tam adını giriniz. örnek: metin.txt, dosya.doc vb= ");
        String Giris=sc.next();
        for(int i=0; i<Giris.length(); i++){
            char ch = Giris.charAt(i);
            String stringKarakter = String.valueOf(ch);

            if(stringKarakter.equals(".")){
                System.out.println();

            }
            else{
                System.out.print(stringKarakter);
            }
        }


    }
}
