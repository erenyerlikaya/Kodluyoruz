import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("V�cut kitle indeksi hesaplamaya ho�geldiniz...");
		
		Scanner scanner = new Scanner(System.in);
		
		//Boy ve kilo "," ile girilmelidir.
		
		System.out.println("Kilonuzu giriniz (kg) : ");
		double kilo = scanner.nextDouble();
		
		System.out.println("Boyunuzu giriniz (m) : ");
		double boy = scanner.nextDouble();
		
		double vki = kilo / (Math.pow(boy, 2));
		
		System.out.println("V�cut kitle indeksiniz : " + vki);
		
		
	}

}


 
 