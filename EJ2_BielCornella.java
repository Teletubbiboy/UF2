import java.util.Scanner;

public class EJ2_BielCornella {
	public static void main (String [] args){
		Scanner s = new Scanner(System.in);
		int array[]; 
		int mida = 0;
		int buscar = 0;
		int posicio = -1;
		
		System.out.print("Ingresi la longitut del vector: ");
		
		while (!s.hasNextInt()){
			System.out.println("Ha de ser un nombre enter!");
			s.next();
		}
		mida = s.nextInt();
		array = new int [mida];
		
		System.out.println("Ingresi els elements del vector:");
		
		for(int i = 0; i < mida; i++){
			System.out.print("Element " + (i + 1) + ": ");
			while (!s.hasNextInt()){
				System.out.println(" Ha de ser un nombre enter!");
				s.next();
			}
			array[i] = s.nextInt();
		}
		
		System.out.print("Ingresi el valor a buscar: ");
		
		while (!s.hasNextInt()){
			System.out.println("Ha de ser un nombre enter!");
			s.next();
		}
		buscar = s.nextInt();
		
		for(int i = 0; i < mida; i++){
			if (buscar == array[i]){
				posicio = i;
				i = mida;
			}
		}
		
		if (posicio != -1){
			System.out.print("El valor " + buscar + " s'ha trobat a la posició " + posicio + " del vector.");
		}
		else {
			System.out.print("El vaor " + buscar + " no s'ha trobat al vector.");
		}
	}	
}