import java.util.Scanner;

public class RegistreTemperatures_PART2 {
  //Constants
  private static final int MAX_SETMANES = 52;

  //Variables globals
  private int numTemperatures = 0;
  private float[] temperatures = new float[MAX_SETMANES * 7];
  private int dia = 1;
  private int mes = 1;
  boolean continuar = true;

  //M todes associats al problema general
  public static void main (String[] args) {
    RegistreTemperatures_PART2 programa = new RegistreTemperatures_PART2();
    programa.inici();
  }

  public void inici() {
    while (continuar){
      mostrarMenu();
      tractarOpcio();
    }
  }

  //Mètodes associats al punt 2 
  public void mostrarMenu() {
    System.out.println("\nBenvinguts al registtra de temperatures");
    System.out.println("_______________________________________");
    System.out.println("[RT] Registrar temperatures setmanals.");
    System.out.println("[MJ] Consultar temperatura mitjana.");
    System.out.println("[DF] Consultar difèrencia màxima.");
    System.out.println("[FI] Sortir.");
    System.out.print("Opció: ");
    }

  public void tractarOpcio() {
    String opcio = "";
    Scanner lector = new Scanner(System.in);
    opcio = lector.nextLine().toUpperCase();
    switch (opcio){
        case "RT": 
          registreTemperaturesSetmanals();
          break;
        case "MJ":
          mostrarMitjana();
          break;
        case "DF": 
          mostrarDiferencia();
          break;
        case "FI":
          finalitzarExecucio();
          break;
        default:
          System.out.println("Opció no vàlida");
    }
  }

  //M todes associats al punt 3
  public void registreTemperaturesSetmanals() {
    if((numTemperatures + 7) >= temperatures.length){
      System.out.println("No caben més temperatures");
    }
    else{
      llegirTemperaturesTeclat();
      incrementarData();
    }
  }

  public void mostrarMitjana() {
    if (numTemperatures > 0){
      System.out.print("\nFins avui ");
      mostrarData();
      System.out.print(" la mitjana ha estat de ");
      calculaMitjana();
      System.out.print(" graus.");
    }
    else{
      System.out.print("\nNo hi ha temperatures registrades");
    }
  }

  public void mostrarDiferencia() {
    if (numTemperatures > 0){
      System.out.print("\nFins avui ");
      mostrarData();
      System.out.print(" la diferencia és de ");
      calculaDiferencia();
      System.out.print(" graus.");
    }
    else{
      System.out.print("\nNo hi ha temperatures registrades");
    }
  }

  public void finalitzarExecucio() {
    continuar = false;
  }

  public void llegirTemperaturesTeclat() {
    System.out.println("Escriu les temperatures d'aquesta setmana:");
    Scanner lector = new Scanner(System.in);
    int numLlegides = 0;
    while (numLlegides < 7) {
      if (lector.hasNextFloat()) {
        temperatures[numTemperatures] = lector.nextFloat();
        numLlegides++;
        numTemperatures++;
      }
      else {
        lector.next();
      }
    }
  }

  public void incrementarData() {
    //Quants dies t  aquest mes?
    int diesAquestMes = 0;
    if (mes == 2) {
      diesAquestMes = 28;
    }
    else if ((mes == 4)||(mes == 6)||(mes == 9 )||(mes == 11)) {
      diesAquestMes = 30;
    }
    else {
      diesAquestMes = 31;
    }
    dia = dia + 7;
    //Hem passat de mes?
    if (dia > diesAquestMes) {
      dia = dia - diesAquestMes;
      mes++;
      //Hem passat d’any?
      if (mes > 12) {
        mes = 1;
      }
    }
  }

  public void mostrarData() {
    System.out.print(dia + " de ");
    switch(mes) {
      case 1:
        System.out.print("Gener");
        break;
      case 2:
        System.out.print("Febrer");
        break;
      case 3:
        System.out.print("Març");
        break;
      case 4:
        System.out.print("Abril");
        break;
      case 5:
        System.out.print("Maig");
        break;
      case 6:
        System.out.print("Juny");
        break;
      case 7:
        System.out.print("Juliol");
        break;
      case 8:
        System.out.print("Agost");
        break;
      case 9:
        System.out.print("Setembre");
        break;
      case 10:
        System.out.print("Octubre");
        break;
      case 11:
        System.out.print("Novembre");
        break;
      case 12:
        System.out.print("Desembre");
    }
  }

  public void calculaMitjana() {
    float acumulador = 0;
    for(int i = 0; i < numTemperatures; i++) {
      acumulador = acumulador + temperatures[i];
    }
    System.out.print((acumulador / numTemperatures));
  }

  public void calculaDiferencia() {
    float min = temperatures[0];
    float max = temperatures[0];
    float diferencia = 0;
    for(int i = 1; i < temperatures.length; i++){
        if (temperatures[i] > max){
          max = temperatures[i];
        }
        else if (temperatures[i] < min){
          min = temperatures[i];
        }
    }
    diferencia = max - min;
    System.out.print((diferencia));
  }
}
