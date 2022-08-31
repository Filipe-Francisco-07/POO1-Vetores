package Vetor;
import java.util.Scanner;
public class Vetor_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe um texto: ");
	String sText = input.nextLine();
	
	String []vet = sText.split("");

	
	for(int i = 0; i < vet.length ; i++) {
		System.out.println(vet[i]);
	}
	
	input.close();
	}

}
