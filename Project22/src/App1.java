/*
sadece a ve b kullanılarak degerlerını bırbırlerını atadık.
 */
public class App1 {
    public static void main(String[] args) {
        int a=72 ; int b=23;
        System.out.println(a);
        System.out.println(b);
        
        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println(a);
        System.out.println(b);
        
    }
}
