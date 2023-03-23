import java.util.*;

class TestTriangolo{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		Triangolo t1=null;
		int scelta,p,lato1,lato2,lato3;
		
		do{
			System.out.println("premi 0 per uscire");
			System.out.println("premi 1 per creare un triangolo");
			System.out.println("premi 2 per visualizzare i lati");
			System.out.println("premi 3 per verificare che i lati formano un triangolo");
			System.out.println("premi 4 per il perimetro del triangolo");
			scelta=input.nextInt();
			switch(scelta){
				case 0:
					break;

				case 1:
					do{
						System.out.println("inserisci primo lato");
						lato1=input.nextInt();
						if(lato1<1){
							System.out.println("valore non valido");
						}
					}while(lato1<1);
					do{
						System.out.println("inserisci secondo lato");
						lato2=input.nextInt();
						if(lato2<1){
							System.out.println("valore non valido");
						}
					}while(lato2<1);
					do{
						System.out.println("inserisci terzo lato");
						lato3=input.nextInt();
						if(lato3<1){
							System.out.println("valore non valido");
						}
					}while(lato3<1);
					t1=new Triangolo(lato1,lato2,lato3);
					break;

				case 2:
					if(t1!=null){
						t1.visualizza();
					}
					else{
						System.out.println("prima premi 1");
					}
					break;

				case 3:
					if(t1!=null){
						if(t1.isTri()==true){
							System.out.println("i lati sono OK e la loro misura e':"+t1.lato1+" "+t1.lato2+" "+t1.lato3);
						}
						else{
							System.out.println("i lati non formano un triangolo, premere di nuovo 1 e ridefinire i lati");
						}
					}
					else{
						System.out.println("prima premi 1");
					}
					break;

				case 4:
					if(t1!=null){
						p=t1.perimetro();
						System.out.println("perimetro="+p);
					}
					else{
						System.out.println("prima premi 1");
					}

					break;

				default:
					System.out.println("scelta non prevista");
			}
		}while(scelta!=0);
	}
}