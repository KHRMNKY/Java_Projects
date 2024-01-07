import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] Liste=new double[4];

        /*
         *burada birinci for döngüsünde Listeye eleman ekliyoruz. 
         *ikinci for dongüsünde ise format metodu kullanarak elemanları yazdırdım.
         */

        int i;
        int j;
        for(i=0; i<Liste.length; i++){
            System.out.printf("lütfen %d. elemanı giriniz= ", i);
            double Eleman=sc.nextDouble();
            Liste[i]=Eleman;
        }
        System.out.println();


        for(j=0; j<Liste.length; j++){
            System.out.printf(" eleman %d= %.2f", j, Liste[j]);
        }
        System.out.println();


        /*
         * Listede ki elemanların toplamını yazdırdım bu for döngüsü ile.
         */

        double Toplam=0;
        for(int m=0;m<Liste.length; m++){
            Toplam=Toplam+Liste[m];   
        }
        System.out.printf("liste elemanlarının toplamı= %.2f ' dir ", Toplam);



        /*
         * bu for döngüsünde Listede ki en büyük elemanı buluyorum. 
         * 0. elemanın en buyuk deger oldugunu varsayarak başlıyorum.
         */
        
        double Enbuyuk=Liste[0];
         for(int l=0; l<Liste.length; l++){
            if(Liste[l]>Enbuyuk){
                Enbuyuk=Liste[l];
                System.out.println("listede ki en buyuk deger= "+ Enbuyuk);
            }
         }

    }
}
