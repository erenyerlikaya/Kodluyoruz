import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Manav kasa program�na ho�geldiniz...");
		
		double armut,elma,domates,muz,patl�can;
		armut = 5;
		elma = 3.60;
		domates = 4.20;
		muz = 18;
		patl�can = 6.90;
		
		System.out.println("Armut ka� kilo");
		int a = scanner.nextInt();
		
		System.out.println("elma ka� kilo");
		int e = scanner.nextInt();
		
		
		System.out.println("domates ka� kilo");
		int d = scanner.nextInt();
		
		
		System.out.println("Muz ka� kilo");
		int m = scanner.nextInt();
		
		
		System.out.println("Patl�can ka� kilo");
		int p = scanner.nextInt();
		
		double toplamTutar = (armut * a) + (elma * e) + (domates * d) * (muz * m) + (patl�can *p);
		System.out.println("Toplam tutar : " + toplamTutar);
		
	}

}
