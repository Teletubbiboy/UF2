import java.util.Scanner;

public class EJ1_BielCornella{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int array1 [];
		int array2 [];
		int arraySuma [];
		int mida = 0;
		
		System.out.print("Ingresi la longitut dels vectors: ");
		
		while (!s.hasNextInt()){
			System.out.println("Ha de ser un nombre enter!");
			s.next();
		}
		mida = s.nextInt();
		array1 = new int [mida];
		array2 = new int [mida];
		arraySuma = new int [mida];
		
		System.out.println("Ingresi els valors del primer vector:");
		array1 = emplenaArray(mida, s);
		System.out.println("Ingresi els valors del segon vector:");
		array2 = emplenaArray(mida, s);
		
		System.out.println("La suma dels vectors és:");
		
		for(int i = 0; i < mida; i++){
			arraySuma[i] = array1[i] + array2[i];
			System.out.print(arraySuma[i] + " ");
		}
	}
	
	public static int[]emplenaArray(int mida, Scanner s){
		int [] array = new int [mida];
		
		for(int i = 0; i < mida; i++){
			System.out.print("Element " + (i + 1) + ": ");
			while (!s.hasNextInt()){
				System.out.println(" Ha de ser un nombre enter!");
				s.next();
			}
			array[i] = s.nextInt();
		}
		return array;
	}
}