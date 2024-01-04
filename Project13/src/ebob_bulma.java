import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("lütfen birinci sayiyi giriniz=");
        int number1=sc.nextInt();
        System.out.println("lütfen birinci sayiyi giriniz=");
        int number2=sc.nextInt();

        int ebob=1;
        int Max=Math.max(number1,number2);
        for(int i=1; i<=Max; i++){
            if(number1%i==0 && number2 %i==0){
                ebob=i;

            }

            else{
                continue;
            }


        }

        System.out.println("ebob="+ ebob);





    }
}
