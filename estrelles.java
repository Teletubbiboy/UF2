import java.util.Scanner;

public class estrelles {

    public static void main(String [] args){
        char guio = '-';
        char estrella = '*';
        imprimirChar(quants(), estrella);
        imprimirChar(quants(), guio);
        imprimirNombre(quants(), quinNombre());
        imprimirChar(quants(), estrella);
        imprimirChar(quants(), guio);
        imprimirNombre(quants(), quinNombre());
    }

    public static int quants(){
        Scanner s = new Scanner(System.in);
        int numero = 0;
        System.out.println("Quants vols imprimir?");

        if(s.hasNextInt()){
            numero = s.nextInt();
        }
        else{
            s.next();
        }
        return numero;
    }

    public static void imprimirChar (int nombre, char caracter){
        for (int i = 0; i < nombre; i++){
            System.out.print(caracter);
        }
        System.out.println();
    }
    
    public static int quinNombre(){
        Scanner s = new Scanner(System.in);
        System.out.println("Quin nombre vols que s'imprimeixi?");
        int quin = 0;
        if (s.hasNextInt()){
            quin = s.nextInt();
        }
        else{
            s.next();
        }
        return quin;
    }

    public static void imprimirNombre (int quants, int quin){
        for (int i = 0; i < quants; i++){
            System.out.print(quin);
        }
        System.out.println();
    }


}