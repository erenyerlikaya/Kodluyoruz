import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double PI = 3.14;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Daire alan hesaplamaya ho?geldiniz... ");
		
		System.out.println("Dairenin yar??ap?n? giriniz : ");
		double r = scanner.nextDouble();
	 
		System.out.println("Merkez a??s?n? giriniz : ");
		double merkezAci = scanner.nextDouble();
		
		double dilimAlan = (r * r * PI * merkezAci)/360;
		
		System.out.println("Daire diliminizin alan? : " + dilimAlan);
		

	}

}
