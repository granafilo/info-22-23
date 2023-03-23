import java.util.*;

class Esempio2{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("dammi il dividendo");
		a=input.nextInt();
		System.out.println("dammi il divisore");
		b=input.nextInt();

		try{
			c=a/b;
			System.out.println("risultato="+c);
		}
		catch(ArithmeticException err){
			System.out.println("errore hai diviso per zero");
		}
	}
}