
public class PredavanjeTest4 {
public static void main(String[] args) {
	int faktorijel = 5;
	int broj = 1;
	int proizvod = 1 ;
	/**
	 * kada je u pitanju proizvod neke varijable bitno je postaviti da je 
	 * int varijabe = 1
	 * za sabiranje je 
	 * int varijabele = 0
	 */
	
	while (broj <= faktorijel) {
		
		proizvod = proizvod * broj;
		broj++;
		
	}
	System.out.printf("Faktorijel od broa 5 je: %d.", proizvod);
	
	/**
	 * nacina sa for petljom
	 * samo ovo sad racuna faktorijel od faktorijela
	 */
	
	
	for (broj = 1; broj<=faktorijel; broj++) {
		proizvod = proizvod * broj;
	}
	System.out.printf("%nFaktorijel od broa 5 je: %d.", proizvod);
}
}
