import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double tutar = 10;
		
		System.out.println("Gidce�iniz yer ka� kilometre ? ");
		int gidilecekKm = scanner.nextInt();
		
		double kmYakit = 2.20;
		
		if(gidilecekKm > 9) {
			tutar = (kmYakit * gidilecekKm) + tutar;
			
		
		}
		else {
			tutar = 20;
			
		}
		
	System.out.println("Taksimetre �cretiniz : " + tutar);

	}

}
