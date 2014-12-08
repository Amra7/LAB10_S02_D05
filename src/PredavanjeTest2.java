
public class PredavanjeTest2 {

	public static void main(String[] args) {
		int prvi = 1;
		int zadnji  = 5;
		int suma = 0 ;
		
		/**
		 * sabiranje varijabla je jednaka 0
		 * int suma = o
		 */
		
		for (  prvi = 1; prvi <= zadnji; prvi++ ){
			suma = suma + prvi;
			
		}
		System.out.println("Suma dva broja od 1 do 5 je:" + suma);
		
		
		/**
		 * for petlja  kraca izgleda od while petlje
		 * za while petlju potrebno je uvrstiti jos jednu varijablu
		 */
		
		int maksimalniBroj = TextIO.getInt();
		
		int brojac = 0;
				
				while (brojac< maksimalniBroj) {
					
					brojac = brojac + 1;
					System.out.println("Suma brojeva od 1 do 5 je:" + brojac);
				}
		
		
	}
}
