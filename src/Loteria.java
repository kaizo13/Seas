	import java.util.ArrayList;
import java.util.Scanner;
public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> boleto=new ArrayList <> ();
		ArrayList <String> boleto2=new ArrayList <> ();
		
		Scanner dato=new Scanner(System.in);
		Integer entrada=-1;
		
		Integer intentos=0;
		Integer aciertos=0;
		
		for(int i=0;i<9;i++) {
			int number=randomNumber(boleto);
			boleto.add(number);
			boleto2.add(i, Integer.toString(number));
			
		}
		
		for(int k=0;k<boleto.size();k++) {
			
			System.out.print(boleto2.get(k) + " ");
		}
				
		do{
			
			System.out.println();
			entrada=dato.nextInt();
			if(entrada != 0) {
				for(int k=0;k<boleto.size();k++) {
					if(boleto.get(k)==entrada) {
						boleto2.set(k, "XX");
						aciertos ++;
					}
					System.out.print(boleto2.get(k) + " ");
				}
				
				intentos++;
			}
			
			
		}while(entrada!=0 && intentos<15 && aciertos<9);
		
		dato.close();
		
		System.out.println();
		if(aciertos==9) {
			System.out.println("Lo conseguiste!!!");
		}else if(intentos==15) {
			System.out.println("Has superado el máximo número de intentos");
		}else if(entrada == 0) {
			System.out.println("Saliste con exito");
		}
	
	}
	
	public static int randomNumber(ArrayList <Integer> boleto) {
		int number=(int)(Math.random()*(100-10)+10);
		Boolean existe=false;
		
		if(boleto.size()>0) {
			for(int j=0;j<boleto.size();j++) {
				if(boleto.get(j)==number) {
					existe=true;
				}
			}
			
			if(existe) {
				number=randomNumber(boleto);
			}
		}
		
		return number;
		
	}

}
