/*
degerlerını karsılıklı olarak bırbırıne atadık burda 3 degısken kullandık. App1 projesınde sadece a ve b kullanarak yaptık.
 */
public class App {
    public static void main(String[] args) {
        int a=23 ; int b=72;
        System.out.println(a);
        System.out.println(b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);


        
    }
}
