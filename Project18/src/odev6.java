/*
verılen bir matriste ki çift sayıları yazdıran bir program yazdım.
 */


public class odev6 {
    public static void main(String[] args){
        int[][] dizi={
            {40,33,69},
            {82,30,70},
            {24,91,11}};


        System.out.println("Matris ");

        int [] List=new int[10];
        int i=0;
        int n=0;
        int count=0;
        while(i<3){
            for(int j=0; j<3; j++ ){
                System.out.print(dizi[i][j]+" ");
                if((dizi[i][j])%2==0){
                    List[n]=dizi[i][j];
                    count++;
                    n++;
                }
            }
            System.out.println();
            i++;
        }

        System.out.println("matris de çift olan sayılarınızın listesi= ");
        int m=0;
        while(m<count){
            System.out.print(List[m]+ " ");
        m++;
        }
        


    }
    
}
