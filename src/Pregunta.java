import java.util.*;
import java.math.*;
public class Pregunta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato= new Scanner(System.in);
		int entrada;
		
		int intentos=5;
		
		String [][] preguntas={
				{"¿En qué año se descubrió América?","1492"},
				{"¿En qué año fue la revolución francesa?","1789"},
				{"¿Cuantos kg hay en una tonelada?","1000",}
		};
		
		 int index=(int)(Math.random()*preguntas.length);
		 
		 
		
		int respuesta=Integer.parseInt(preguntas[index][1]);
		
		System.out.println(preguntas[index][0]);
		
		entrada=Integer.parseInt(dato.nextLine());
		
		while(entrada != respuesta && intentos > 1 ) {
			
			if(entrada > respuesta) {
				System.out.println("Menos");
			}else {
				System.out.println("Más");
			}
			
			intentos--;
			System.out.println("Intentos restantes: " +intentos);
			System.out.println(preguntas[index][0]);
			entrada=Integer.parseInt(dato.nextLine());
		};
		
		if(intentos==0 || entrada != respuesta) {
			System.out.println("La patata explotó");
		}else {
			System.out.println("Correcto, número de intentos: " + (6-intentos));
		}
		
		
		
	}

}
