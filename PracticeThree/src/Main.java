import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("��genin alan hesaplamaya ho�geldiniz...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��genin birinci kenar�n� giriniz : ");
		int a = scanner.nextInt();
		
		System.out.println("��genin ikinci kenar�n� giriniz : ");
		int b = scanner.nextInt();
		
		System.out.println("��genin ���nc� kenar�n� giriniz : ");
		int c = scanner.nextInt();
 
		double u = (a + b + c) / 2;
		double alanKare;
		
		alanKare = u *(u-a) * (u-b) * (u-c);
		
		System.out.println("��genin �evresi : " +  2 * u);
		System.out.println("��genin alan� : "  + Math.sqrt(alanKare));
		
		
	}

}
