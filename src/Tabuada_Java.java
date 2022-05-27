import java.util.Scanner;
public class Tabuada_Java {

	private static final char[] Resultado = null;

	public static void main(String[] args) {
	Scanner tc = new Scanner (System.in);
	
	//=============== TABUADA ==============
	
	int num,Resultado;
	
	System.out.println(" Insira um numero :");
		num = tc.nextInt();
		
		
		int mult = 1;
		while (mult <=10) {
			
			Resultado = num * mult;
			
			
			System.out.println(num +"x" + mult+ "="+ Resultado);
			mult ++;
			
		}
		
	}

}
