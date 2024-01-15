/*
Soru 1: TC kimlik numarası 11 rakamdan oluşan bir sayıdır. TC kimlik numaranızı parametre olarak alan 
bir fonksiyon TC kimlik numarasının ilk 9 rakamını 3x3 boyutunda bir matrise yerleştirmektedir. Son iki 
basamak 50 den büyük ise en büyük toplama sahip sütun pozisyon değerini; son iki basamak 50 den küçük 
ise en küçük toplama sahip satır pozisyonunu geri döndüren fonksiyonu kodlayınız.

 */


public class App_devam_edılecek {
    
    public static void fonksiyon(int tc){
        int[][] matris=new int[3][3];
        String Str_Tc=Integer.toString(tc);


        int i=0;
        for(int m=0; m<3; m++){
            for(int n=0; n<3; n++){
                char ch=Str_Tc.charAt(i);
                matris[m][n]=ch;
            }
            i++;   
        }
    

    for(int m=0; m<3; m++){
        for(int n=0; n<3; n++){
            System.out.print(matris[m][n]+" ");
        }
        System.err.println();
        
    }

        }
    
    public static void main(String[] args) throws Exception {
        fonksiyon(2048315164);
    }
}
