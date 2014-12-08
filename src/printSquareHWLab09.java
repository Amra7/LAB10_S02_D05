
public class printSquareHWLab09 {
public static void main(String[] args) {
	
		System.out.println("unesi stranicu a:");
		int a = TextIO.getInt();

		System.out.println("unesi stranicu b:");
		int b = TextIO.getInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if ((i == 0) || (i == a - 1) || (j == 0) || (j == b - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println(" ");
}
}
}
