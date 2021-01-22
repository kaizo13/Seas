import java.util.*;
public class Palabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> palabras= new ArrayList <>(Arrays.asList("Boligrafo","Carpeta","Estuche","Rotulador","Goma"));
		ArrayList <String> dichas=new ArrayList<>();	
		Scanner dato=new Scanner(System.in);
		Boolean cierto=true;
		int aciertos =0;
		while(dichas.size()<palabras.size() && cierto) {
		
			String palabra=dimePalabra(palabras,dichas);
			dichas.add(palabra);
			System.out.println(palabra);
			String entrada=dato.nextLine();
			
			
			String [] lista=entrada.split(" ");
			
			for(int i=0;i<dichas.size();i++) {
				if(!lista[i].equals(dichas.get(i))) {
					cierto=false;
				}
			}
			if(cierto) {
				aciertos++;
			}else {
				System.out.println("Partida finalizada");
				System.out.println("Has acertado " + aciertos + " de " + palabras.size());
			}
		
			
		}
		
		if(dichas.size()==palabras.size()) {
			System.out.println("Eres un crack!!!!");
		}
		
	}
	
	public static String dimePalabra(ArrayList <String> palabras, ArrayList <String> dichas) {
		Random rand=new Random();
		int index=rand.nextInt(palabras.size());
		Boolean existe=false;
		String palabra=palabras.get(index);
		
		for(int k=0;k<dichas.size();k++) {
			
			if(palabra.equals(dichas.get(k))) {
				existe=true;
				break;
			}
		}
		
		if(existe) {
			palabra=dimePalabra(palabras, dichas);
		}
				
		return palabra;
	}

}
