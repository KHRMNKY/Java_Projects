import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=(int) (Math.random()*101);

        while (true){
            System.out.println("lütfen 0-100 arasında bir sayi tahmin ediniz=");
            int predict=sc.nextInt();

            if (predict==number){
                System.out.println("tebrikler doğru tahmin ettiniz..");
                break;

            }

            else if(predict>number){
                System.out.println("tahmininiz yüksek");
            }

            else{
                System.out.println("tahmininiz düşük");
            }

        }

    }
}
