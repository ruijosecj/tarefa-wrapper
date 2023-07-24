import java.util.Scanner;

public class TarefaWrapper {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	    int numeroInt;
	    Long numeroLong = 0l;

	    System.out.printf("Informe o número:\n");
	    numeroInt = ler.nextInt();
	    
	    numeroLong = Long.valueOf(numeroInt);
	    System.out.println("Casting implicito de int para long: " +numeroLong);
	    
	    System.out.println(numeroLong.TYPE);
	    
	}
}
