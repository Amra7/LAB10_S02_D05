
public class PredavanjeTest3 {
public static void main(String[] args) {
	int prvi =1;
	int zadnji = 50;
	int brojac = 0;
	int suma = 0;
	
	/**
	 * 
	 * int sume  = 0
	 */
	
	while (brojac < zadnji) {
		brojac = brojac + prvi;
		suma= suma + brojac;
	} 
	System.out.printf("Suma brojeva od 1 do 50 je: %d", suma);
	
	
	
}
}
