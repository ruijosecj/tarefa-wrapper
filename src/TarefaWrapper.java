import java.util.Scanner;

public class TarefaWrapper {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	    int numeroInt;

	    System.out.printf("Informe o número:\n");
	    numeroInt = ler.nextInt();
	    
	    long numeroLong = numeroInt;
	    System.out.println("Casting implicito de int para long: " +numeroLong);
	    
	}
}
