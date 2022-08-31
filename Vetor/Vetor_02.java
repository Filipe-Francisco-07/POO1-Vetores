package Vetor;
import java.util.Scanner;
public class Vetor_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int TAM = 10;
	int [] vet = new int [TAM];
	
	for(int i = 0; i < TAM;i++) {
		System.out.print("Informe o "+(i+1)+"° número: ");
		vet[i] = input.nextInt();
	}
	
	for(int i = 9; i >= 0;i--) {
		if(i==9) {
			System.out.println("Os números na ordem contrária são: \n"+vet[i]);
		}else {
			System.out.println(vet[i]);
	}
	}
	input.close();
	}

}
