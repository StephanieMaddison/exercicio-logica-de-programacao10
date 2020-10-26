import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe tres valores:");

		double a = ler.nextDouble();
		double b = ler.nextDouble();
		double c = ler.nextDouble();

		Metodo metodo = new Metodo();
		
		metodo.triangulo(a, b, c);

		ler.close();

	}

}
