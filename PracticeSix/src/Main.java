import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Manav kasa programýna hoþgeldiniz...");
		
		double armut,elma,domates,muz,patlýcan;
		armut = 5;
		elma = 3.60;
		domates = 4.20;
		muz = 18;
		patlýcan = 6.90;
		
		System.out.println("Armut kaç kilo");
		int a = scanner.nextInt();
		
		System.out.println("elma kaç kilo");
		int e = scanner.nextInt();
		
		
		System.out.println("domates kaç kilo");
		int d = scanner.nextInt();
		
		
		System.out.println("Muz kaç kilo");
		int m = scanner.nextInt();
		
		
		System.out.println("Patlýcan kaç kilo");
		int p = scanner.nextInt();
		
		double toplamTutar = (armut * a) + (elma * e) + (domates * d) * (muz * m) + (patlýcan *p);
		System.out.println("Toplam tutar : " + toplamTutar);
		
	}

}
