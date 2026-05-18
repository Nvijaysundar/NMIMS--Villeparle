import java.util.Scanner;

public class CiferText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Text :");
		String s = sc.nextLine().toUpperCase();
		
		
		s = s.replaceAll("[ABC]", "2").replaceAll("[DEF]", "3")
			 .replaceAll("[GHI]", "4").replaceAll("[JKL]", "6")
			 .replaceAll("[MNO]", "6").replaceAll("[PQRS]", "7")
			 .replaceAll("[TUV]", "8").replaceAll("[WXYZ]", "9");
		System.out.println(s.toString());
		sc.close();
	}
}
