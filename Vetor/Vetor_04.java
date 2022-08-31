package Vetor;
import java.util.Scanner;
public class Vetor_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int TAM = 10;
	
	char [] vet = new char [TAM];
	
	for(int i = 0; i < TAM;i++) {
		System.out.print("Informe a "+(i+1)+"° letra: ");
		vet[i] = input.next().charAt(0);

	}
	
	for(int i = 0; i < TAM;i++) {
		if(vet[i]!='a'&& vet[i] !='e'&& vet[i]!='i'&&vet[i]!='o'&&vet[i]!='u') {
			System.out.println("Consoante: "+vet[i]);
		}
	}
	
	input.close();
	}

}