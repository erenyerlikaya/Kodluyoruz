import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double PI = 3.14;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Daire alan hesaplamaya hoþgeldiniz... ");
		
		System.out.println("Dairenin yarýçapýný giriniz : ");
		double r = scanner.nextDouble();
	 
		System.out.println("Merkez açýsýný giriniz : ");
		double merkezAci = scanner.nextDouble();
		
		double dilimAlan = (r * r * PI * merkezAci)/360;
		
		System.out.println("Daire diliminizin alaný : " + dilimAlan);
		

	}

}
