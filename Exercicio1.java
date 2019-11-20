import java.util.Scanner;
public class Exercicio1 {
	
	public static void main (String[] args) {
	Scanner ler= new Scanner (System.in);
	double investimento,resultado;
	int numeroMes;
	System.out.println("Digite o valor do Investimento:");
	investimento=ler.nextDouble();
	System.out.println("Digite o número de meses em que o dinheiro ficou investido:");
	numeroMes=ler.nextInt();
	resultado=jurosComposto(investimento,numeroMes);
	System.out.println(resultado);
	}
	
	public static double jurosComposto(double investimento,int numeroMes) {
	for (int i=1;i<=numeroMes;i++) {
		investimento=investimento+(investimento*0.01);
	}
	
	return investimento;
	}

}
