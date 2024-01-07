/*
 *matris1 ve matris2 nin aynı indekste ki elemanlarını toplayıp farklı bir toplam_matrisinie aktardım. 
 */


public class matris {
    public static void main(String[] args){
        int[][] matris1={{1,2,3,6},{4,8,5,6},{9,7,8,9}};
        int[][] matris2={{7,7,6,4},{5,6,0,3},{1,9,3,0}};
        int[][] toplam_matris=new int[3][4];
        for(int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                toplam_matris[i][j]=matris1[i][j] + matris2[i][j];
            }
        }
        
        
        for(int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                System.out.print(toplam_matris[i][j]+" ");
            }
            System.out.println();
        }



    }
}
