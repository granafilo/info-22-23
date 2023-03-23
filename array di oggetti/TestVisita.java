import java.util.*;

class TestVisita{
	public static void main(String arg[]){
		Visita elenco[]=new Visita[1000];
		Scanner input=new Scanner(System.in);
		int scelta,giorno,mese,anno,i=0,cont;
		String nome_animale,vuota;
		float costo,costo_tot;
		boolean trovato;

		do{
			System.out.println("premi 0 per uscire");
			System.out.println("premi 1 per creare un oggetto della classe Visita");
			System.out.println("premi 2 per visualizzare gli oggetti creati");
			System.out.println("premi 3 per calcolare i costi totali relativi ad ud animale il cui valore e' preso in input");
			scelta=input.nextInt();
			vuota=input.nextLine();
			switch(scelta){
				case 0:
					break;

				case 1:
					if(i<1000){
						System.out.println("dammi il nome dell'animale");
						nome_animale=input.nextLine();
						System.out.println("dammi il giorno della visita");
						giorno=input.nextInt();
						vuota=input.nextLine();
						System.out.println("dammi il mese della visita");
						mese=input.nextInt();
						vuota=input.nextLine();
						System.out.println("dammi l'anno della visita");
						anno=input.nextInt();
						vuota=input.nextLine();
						System.out.println("dammi il costo della visita");
						costo=input.nextFloat();
						vuota=input.nextLine();
						elenco[i]=new Visita(nome_animale,giorno,mese,anno,costo);
						i++;
					}
					else{
						System.out.println("elenco pieno");
					}	
					break;

				case 2:
					for(cont=0;cont<i;cont++){
						System.out.println("nome animale="+elenco[cont].getNome());
						System.out.println("data visita="+elenco[cont].getGiorno()+"-"+elenco[cont].getMese()+"-"+elenco[cont].getAnno());
						System.out.println("costo visita"+elenco[cont].getCosto());
					}
					break;
					
				case 3:
					System.out.println("dammi il nome dell'animale");
					nome_animale=input.nextLine();
					trovato=false;
					costo_tot=0;
					for(cont=0;cont<i;cont++){
						if(nome_animale.equals(elenco[cont].getNome())==true){
							costo_tot=costo_tot+elenco[cont].getCosto();
							trovato=true;
						}
					}
					if(trovato==false){
						System.out.println("animale non trovato");
					}
					else{
						System.out.println("costo totale per l'animale "+nome_animale+"="+costo_tot);
					}
					break;
				
				default:
					System.out.println("scelta non prevista");
			}
		}while(scelta!=0);
	}
}