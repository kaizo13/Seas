import java.io.*;
public class EscribirLeerArchivo {
	
	private FileReader leer;
	private FileWriter escribir;
	private String nombreArchivo;
	
	public EscribirLeerArchivo(String nombreArchivo) {
		this.nombreArchivo=nombreArchivo;
	}
	
	public void escribirArchivo() throws IOException{
		escribir=new FileWriter(nombreArchivo);
		for(char caracter='A';caracter<='Z';caracter++) {
			escribir.write(caracter);
		}
		escribir.close();
	}
	
	public void leerArchivo() throws FileNotFoundException,IOException{
		leer=new FileReader(nombreArchivo);
		int caracter;
		do {
			caracter=leer.read();
			System.out.print((char) caracter + " ");
		}while(caracter!=-1);
		leer.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EscribirLeerArchivo cosa=new EscribirLeerArchivo("hola.txt");
		
		try {
			cosa.escribirArchivo();
			cosa.leerArchivo();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
