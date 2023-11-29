package tutorial1;
import java.util.Scanner;
 public class Ikinci_Dereceden_Denklem_Kok_Bulma{
	 public static void main(String[] args){
		 System.out.println("ikinci dereceden denkleminizin katsayılarını giriniz= ");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("x^2 katsayısını giriniz= ");
		 int a=sc.nextInt();
		 System.out.println("x in katsayısını giriniz= ");
		 int b=sc.nextInt();
		 System.out.println("sabiti giriniz= ");
		 int c=sc.nextInt();
		 double delta=(b^2)-(4*a*c) ;
		 double x1= (-b+Math.pow(delta,0.5))/(2*a);
		 double x2= (-b-Math.pow(delta,0.5))/(2*a);
		 System.out.println("denkleminizin kökleri= "+ x1+" "+ x2);
		 
		 
		 
	 }
 }
