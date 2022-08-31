package Vetor;
import java.util.Scanner;
public class Vetor_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int [] vet1 = new int[10];
	int [] vet2 = new int[10];
	int [] vet3 = new int[20];
	
	
	for(int i = 0; i < 10 ;i++) {
		System.out.print("Informe o "+(i+1)+" número do vetor1: ");
		vet1[i] = input.nextInt();
		System.out.print("Informe o "+(i+1)+" número do vetor2: ");
		vet2[i] = input.nextInt();
	}
	
	for(int i = 0; i < 20 ; i++) {
		
		if(i <= 10) {
		
			if((i+1) % 2 == 0) {
				vet3[i] = (vet2[i]);
			}else {
				vet3[i] = (vet1[i]);
			}
		}else if(i > 10) {
			vet3[i] = (vet2[i/2]);
		}else {
			vet3[i] = (vet1[i/2]);
		}
	}
	for(int i = 0; i < 20;i++) {
		System.out.print(vet3[i]+" ");
	}
	

	input.close();
	}

}