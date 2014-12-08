
public class SumaPocetkaKraja {
public static void main(String[] args) {
	System.out.println("Unesi prvi broj");
	int prvi = TextIO.getInt();
	System.out.println("Unesi prvi broj");
	int drugi = TextIO.getInt();
	int suma = 0;

	while ( prvi<=drugi) {
		
		suma = suma + prvi;
		prvi++;
		
	} System.out.println("Suma izmedju brojeva je: " + suma);

	
}
}
