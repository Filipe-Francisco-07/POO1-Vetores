package Vetor;
import java.util.Scanner;
public class Vetor_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int TAM = 10;
	final int NOTA = 4;
	
	float fSoma = 0;
	int j = 0;
	
	float [] vet = new float [NOTA];
	float [] aMedia = new float[TAM];;

	for(int x = 0;x < 10;x++) {
		for(int i = 0; i < NOTA;i++) {
			System.out.print("Informe a "+(i+1)+"° nota: ");
			vet[i] = input.nextFloat();
		
			fSoma = fSoma + vet[i];
			if(i == 3) {
				j++;
				aMedia[j] = (fSoma/NOTA);
			}

		}
	}	
	for(int i = 0; i < TAM;i++) {
		System.out.println((i+1)+"° média: "+aMedia[i]);
		
	}
	input.close();
	}

}