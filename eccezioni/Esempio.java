import java.util.*;

class Esempio{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("dammi il dividendo");
		a=input.nextInt();
		System.out.println("dammi il divisore");
		b=input.nextInt();
		c=a/b;
		System.out.println("risultato"+c);
	}
}

