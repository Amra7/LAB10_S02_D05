
public class ParniBrojeviod1doN {
public static void main(String[] args) {
	
		System.out.println("Unesi jedan broj:");
		int n = TextIO.getInt();
		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
	}
}
}
