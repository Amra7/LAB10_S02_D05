
public class ProstiBroj {
public static void main(String[] args) {

		System.out.println("Unesi neki broj:");
		int broj = TextIO.getInt();
		int i = 2;
		boolean jeProst = true; 
		/**
		 * moguce je i koristiti:  int borjacD=0;
		 */

		while (i < broj) {

			if (broj % i == 0) {
				jeProst = false;
				/**
				 *borjacD++;
				 */
				break;
				/**
				 * break; se satavlja prije i++ kako ne bi bespotrebno se obavljala funkcija vise puta
				 */
			}
			i++;

		}
		if (jeProst == false) {
			System.out.println("Broj nije prost");
		}else{
		System.out.println("Broj je prost");
		}
}
}
