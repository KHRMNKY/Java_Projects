public class odev5{
    public static void main(String[] args){
        int i=0;
        while(i<7){
            for(int j=i; j>1 ;j-- ){
                System.out.print(j+"***");

            }
            System.out.println("-"+ i+ "-");
            i++;
        }


    }
}