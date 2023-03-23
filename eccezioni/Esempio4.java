import java.util.*;
class Esempio4{
	public static void main(String arg[]){
		int v[]=new int[10];
		int cont,i=15, num;
		Scanner input=new Scanner (System.in);

		try{
			for(cont=0;cont<i;cont++){
				v[cont]=10;
			}	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("indice troppo alto");
		}
		num=input.nextInt();
	}
}