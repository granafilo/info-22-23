import java.util.*;
class Esempio6{
	public static void main(String arg[]){
		int num;
		System.out.println("dammi un numero");
		Scanner input=new Scanner(System.in);
		try{
			num=input.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("errore, non hai digitato un numero");
		}
		
	}
}