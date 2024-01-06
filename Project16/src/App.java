import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int number1;
        int number2;

        do {
            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);
            System.out.println(number1 + " ile " + number2 + " toplamını giriniz.");
            sum = sc.nextInt();
            if (sum != (number1 + number2)){
                System.out.println("Yanlış topladınız, tekrar deneyiniz.");
            }
            
        } 
        while (sum != (number1 + number2));
            System.out.println("Tebrikler, doğru cevabı girdiniz.");
        

            
        

    }
}

