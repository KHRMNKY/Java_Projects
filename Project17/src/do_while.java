import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=(int) (Math.random()*101);
        int predict;
        do {
            System.out.println("lütfen 0-100 arasında bir sayi tahmin ediniz=");
            predict=sc.nextInt();

            if(predict>number){
                System.out.println("tahmininiz yüksek");
            }

            else{
                System.out.println("tahmininiz düşük");
            }

        }
        while(predict !=number);
        System.out.println("tebrikler doğru tahmin ettiniz..");
        

    }
}
