
public class SumaParnihNeparnih {
public static void main(String[] args) {
	
	System.out.println("Unesi prvi broj:");
	int a =TextIO.getInt();
	System.out.println("Unesi drugi broj:");
	int b =TextIO.getInt();
	
	int suma1 = 0;
	int suma2 = 0;		
			
	while (a<=b) {
		if ( a%2==0){
			suma1 = suma1 + a;
			
		}a++;
		if ( a%2!=0){
			suma2 = suma2 + a;
			
		}a++;
	}
	System.out.printf("Suma parnih brojeva: %d", suma1);
	System.out.printf("%nSuma neparnih brojeva je: %d", suma2);
}
}
