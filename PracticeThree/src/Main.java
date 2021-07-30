import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Üçgenin alan hesaplamaya hoþgeldiniz...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üçgenin birinci kenarýný giriniz : ");
		int a = scanner.nextInt();
		
		System.out.println("Üçgenin ikinci kenarýný giriniz : ");
		int b = scanner.nextInt();
		
		System.out.println("Üçgenin üçüncü kenarýný giriniz : ");
		int c = scanner.nextInt();
 
		double u = (a + b + c) / 2;
		double alanKare;
		
		alanKare = u *(u-a) * (u-b) * (u-c);
		
		System.out.println("Üçgenin çevresi : " +  2 * u);
		System.out.println("Üçgenin alaný : "  + Math.sqrt(alanKare));
		
		
	}

}
