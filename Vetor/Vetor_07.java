package Vetor;
import java.util.Scanner;
public class Vetor_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int TAM = 5;
	
	float fMulti = 1;
	float fSoma = 0;

	int [] vet = new int [TAM];

	for(int i = 0;i < TAM;i++) {
		System.out.print("Informe o "+(i+1)+"° número: ");
		vet[i] = input.nextInt();
		
		fSoma = fSoma + vet[i];
		fMulti = (fMulti*vet[i]);
	
	}	
	System.out.println("A soma é: "+fSoma);
	System.out.println("A Multiplicação é: "+fMulti);
	System.out.println("Os números são: ");
	for(int i = 0; i < TAM;i++) {
		System.out.println(vet[i]);
		
	}
	input.close();
	}

}