public class App {
    public static void main(String[] args) {
        double[][] a = {{1, 2, 3, 4, 5},
                        {50, 30, 20, 40, 10},
                        {170, 240, 320, 430, 550}};
    
    
        double[][] b = {{10, 20},
                        {30, 40},
                        {50, 60},
                        {70, 80},
                        {90, 100}};
    
        double[][] c =new double[a.length][b[0].length];
    
        double sum=0;
        for (int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                sum=sum + (a[i][j])*(b[j][i]);
            }
            System.out.print(sum);
        System.out.println();
        }
    
}
}
