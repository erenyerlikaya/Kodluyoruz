import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//Scanner s�n�f�n� java.utilden import ediyoruz.
		Scanner scanner = new Scanner(System.in);
		
		
		int mat, fizik, kimya, turkce, biyoloji;
		
		//kullan�c�ya notlar� girdiriyoruz
		
		System.out.println("Matematik notunuzu giriniz : ");
		mat = scanner.nextInt();
		System.out.println("Fizik notunuzu giriniz : ");
		fizik = scanner.nextInt();
		System.out.println("Kimya notunuzu giriniz : ");
		kimya = scanner.nextInt();
		System.out.println("T�rk�e notunuzu giriniz : ");
		turkce = scanner.nextInt();
		System.out.println("Biyoloji notunuzu giriniz : ");
		biyoloji = scanner.nextInt();
		
		int toplam = (mat+fizik+kimya+turkce+biyoloji);
		
		
		double ortalama = toplam / 5;
		boolean kosul = ortalama >= 50;
	    System.out.println("Durum = " + (kosul==true ? "Ge�ti" : "Kald�"));
		
		System.out.println("Not ortalaman�z : " + ortalama);

	}

}
