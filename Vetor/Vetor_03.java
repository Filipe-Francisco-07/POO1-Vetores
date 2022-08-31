package Vetor;
import java.util.Scanner;
public class Vetor_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	float fSoma = 0;
	final int TAM = 4;
	
	float [] vet = new float [TAM];
	
	for(int i = 0; i < TAM;i++) {
		System.out.print("Informe a "+(i+1)+"° nota: ");
		vet[i] = input.nextFloat();
		fSoma = (fSoma + vet[i]);
	}
	
	for(int i = 0; i < TAM;i++) {
		System.out.println("Nota "+(i+1)+": "+vet[i]);
	}
	System.out.println("A sua média é: "+(fSoma/TAM));
	
	input.close();
	}

}
