package Vetor;
import java.util.Scanner;
public class Vetor_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	final int N = 10;
	
	int []vet = new int[N];
	
	
	for(int i = 0; i < N ;i++) {
		System.out.println("Informe um número entre 0 e 20: ");
		vet[i] = input.nextInt();
	
	}
	for(int i = 0;i < N;i++) {
	System.out.print((i+1)+": ");
		for(int j = 0;j < vet[i]; j++) {
			System.out.print("#");
		}
		System.out.println("");
	}
	input.close();
	}

}
