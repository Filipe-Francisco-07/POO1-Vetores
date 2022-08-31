package Vetor;
import java.util.Scanner;
public class Vetor_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int TAM = 20;
	
	int [] vet = new int [TAM];
	int [] par = new int [TAM];
	int [] impar = new int [TAM];
	
	for(int i = 0; i < TAM;i++) {
		System.out.print("Informe o "+(i+1)+"° inteiro: ");
		vet[i] = input.nextInt();
		
		if(vet[i] % 2 == 0) {
			par[i] = vet[i];

		}else {
			impar[i] = vet[i];

		}

	}
	for(int i = 0; i < TAM;i++) {
		
		System.out.println("Números: "+vet[i]);
	}
	for(int i = 0; i < TAM;i++) {
		if(par[i] != 0){
			System.out.println("Par: "+par[i]);
		}
	}
	for(int i = 0; i < TAM;i++) {
		if (impar[i] != 0) {
			System.out.println("Ímpar: "+impar[i]);
		}
	}
	
	input.close();
	}

}