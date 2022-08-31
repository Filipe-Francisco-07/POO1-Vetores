package Vetor;
import java.util.Scanner;
public class Vetor_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe uma data(dd/mm/aaaa): ");
	String sData = input.nextLine();
	
	String [] vet = sData.split("/");
	int [] result = new int[vet.length];
	
	for(int i = 0; i < vet.length;i++) {
		result[i] = Integer.parseInt(vet[i]);	
		
		if(result[0] < 0 || result[0] > 31) {
			System.out.println("Data inválida.");
		}else if(result[1] < 0 || result[1] > 12) {
			System.out.println("Data inválida.");
		}
	}
	for(int i = 0; i < result.length;i++){
		if(i==0) {
			System.out.println("Dia: "+result[i]);
		}else if (i==1) {
			System.out.println("Mês: "+result[i]);
		}else {
			System.out.println("Ano: "+result[i]);
		}
	}

	input.close();
	}

}
