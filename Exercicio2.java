import java.util.Scanner;
	public class Exercicio2 {
		public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor gasto:");
		double valor=ler.nextDouble();
		int opcao=menu();
		if(opcao==1) {
			double valorTotal=opcao1(valor);
			System.out.println("O valor a ser pago será de: R$ "+valorTotal);
		}
		else if(opcao==2) {
			double prestacao=opcao2(valor);
			System.out.println("Deverão ser pagas 2 prestações de: R$ "+prestacao);
		
		}
		else if(opcao==3 && valor>100) {
			double total=opcao3(valor);
			System.out.println("O valor das parcelas a serem pagas é de: R$ "+total);
		}
		else if(opcao==3 && valor<100) {
			System.out.println("Para usar essa opção o valor deve ser maior que R$ 100,00");
		}
		else {
		System.out.println("Opção Inválida");
		}
		}
		public static int menu () {
			System.out.println("Digite a opção que deseja:\n 1-À vista com 10% de desconto\n 2-Em duas vezes (preço da etiqueta)\n 3-De 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$100,00)");
		Scanner ler = new Scanner(System.in);
		int opcao=ler.nextInt();
			return opcao;
		}
		public static double opcao1 (double valor) {
		double valorTotal=valor-(valor*0.1);
		return valorTotal;
		}
		public static double opcao2 (double valor) {
		double prestacao=valor/2;
		return prestacao;
		}
		public static double opcao3 (double valor) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o número de prestações que deseja(3 a 10):");
			int np=ler.nextInt();
			if(np<11 && np>2) {
			for (int i=1;i<=np;i++) {
				valor=valor+(valor*0.03);
			}
			valor=valor/np;
			}
			else {
			System.out.println("O número digitado não está entre 3 e 10");
			System.exit(0);
			}
			return valor;
			
			
			
		}
		}

