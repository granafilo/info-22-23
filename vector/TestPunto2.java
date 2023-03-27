import java.util.*;

public class TestPunto2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		Vector<Punto> poligono=new Vector<Punto>(1,1);
		int scelta,scelta2,x,y,i;
		Punto p=null;

		do{
			System.out.println("premi 0 per uscire");
			System.out.println("premi 1 per aggiungere un punto");
			System.out.println("premi 2 per togliere un punto");
			System.out.println("premi 3 per visualizzare tutti i punti");
			System.out.println("premi 4 per modificare un punto");
			scelta=input.nextInt();	

			switch(scelta){
				case 0:		
					break;

				case 1:
					System.out.println("inserisci la coordinata x");
					x=input.nextInt();
					System.out.println("inserisci la coordinata y");					
					y=input.nextInt();
					p=new Punto(x,y);
					poligono.add(p);
					break;

				case 2:
					do{
						System.out.println("inserisci indice punto da togliere");
						i=input.nextInt();
						if((i<0)||(i>=poligono.size())){
							System.out.println("indice non esistente");
						}
					}while((i<0)||(i>=poligono.size()));
					poligono.remove(i);
					
					break;

				case 3:
					for(i=0;i<poligono.size();i++){
						System.out.println("indice="+i);
						p=poligono.get(i);
						System.out.println("x="+p.x);
						System.out.println("y="+p.y);
					}
					break;

				case 4:
					do{
						System.out.println("inserisci indice punto da modificare");
						i=input.nextInt();
						if((i<0)||(i>=poligono.size())){
							System.out.println("indice non esistente");
						}
					}while((i<0)||(i>=poligono.size()));
					p=poligono.get(i);
					System.out.println("x="+p.x);
					System.out.println("y="+p.y);
					System.out.println("premi 0 per uscire, 1 per modificare coordinata x e 2 per modificare coordinata y");
					scelta2=input.nextInt();
					switch(scelta2){
						case 0:
							break;

						case 1:
							System.out.println("nuovo valore di x");
							p.x=input.nextInt();
							poligono.set(i,p);
							break;

						case 2:
							System.out.println("nuovo valore di y");
							p.y=input.nextInt();
							poligono.set(i,p);
							break;

						default:
							System.out.println("scelta non prevista");
					}
					break;
				default:
					System.out.println("scelta non prevista");
			}
		}while(scelta!=0);
	}
}