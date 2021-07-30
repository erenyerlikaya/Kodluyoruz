import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double tutar,kdvOran,kdvTutar,kdvLiTutar;
		
		
		System.out.println("Ücret tutarýný giriniz : ");
		tutar = scanner.nextDouble();
		
		if(tutar > 1000) {
			kdvOran = 0.08;
		}
		else {
			kdvOran = 0.18;
			
			
		}
		kdvTutar = tutar * kdvOran;
		kdvLiTutar = kdvTutar + tutar;
		
		System.out.println("KDV'li tutarýnýz : " + kdvLiTutar);
		
	

	}

}
