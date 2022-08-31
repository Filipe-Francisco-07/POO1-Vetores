package Vetor;
import java.util.Scanner;
public class Vetor_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int N = 30;
	
	float []alt = new float[N];
	int []age = new int[N];
	
	float fSoma = 0;
	float fMedia = 0;
	int k = 0;
	
	
	for(int i = 0; i < N ;i++) {
		System.out.println("Infome sua idade: ");
		age[i] = input.nextInt();
		System.out.println("Informe a sua altura: ");
		alt[i] = input.nextFloat();
		
		if(age[i] > 13) {
			fSoma += alt[i];
		}
	
	}
	fMedia = (fSoma / N);
	
	for(int i = 0;i < N;i++) {
		if(age[i] > 13 && alt[i] < fMedia) {
			k++;
		}	
		
	}
	System.out.println(k+" alunos maiores de 13 anos tem altura inferior a média.");
	
	input.close();
	}

}
