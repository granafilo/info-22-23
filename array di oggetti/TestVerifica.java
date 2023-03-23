import java.util.*;

class TestVerifica{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String codice, cod;
        int scelta = 0,giorno = 0, mese = 0, giorno_c = 0, mese_c= 0, cont = 0, i =0, cont1 = 0, c = 0;
        float costo;
        Verifica elenco[] = new Verifica[500], temp;
        boolean trovato = true, ordinato = true;
        //giorno e mese corrente in input
        System.out.println("Dammi giorno e mese corrente");
        giorno_c=input.nextInt();
        input.nextLine();
        mese_c = input.nextInt();
        input.nextLine();
        
        do{
            System.out.println("premi 0 per uscire");
            scelta = input.nextInt();
            input.nextLine();
            switch(scelta){
                case 0: 
                    break;
                case 1:
                    if(i<500){
                        System.out.println("Dammi il codice");
                        codice = input.nextLine().toUpperCase();
                        System.out.println("Dammi giorno");
                        giorno = input.nextInt();
                        input.nextLine();
                        System.out.println("dammi il mese");
                        mese = input.nextInt();
                        input.nextLine();
                        System.out.println("Dammi il costo");
                        costo = input.nextFloat();
                        input.nextLine();
                        elenco[i] = new Verifica(codice, giorno, mese, costo);
                        i++;
                    }else{
                        System.out.println("L'elenco è pieno");
                    }
                    break;
                case 2:
                    for(cont=0;cont<i;cont++){
                        elenco[cont].visualizza();
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il codice a barre");
                    cod = input.nextLine().toUpperCase();
                    for(cont=0;cont<i;cont++){
                        if(elenco[cont].getcodice().equals(cod)){
                            trovato = false;
                            if(elenco[cont].verificaScadenza(giorno_c, mese_c)){
                                System.out.println("Il prodotto è scaduto");
                            }else{
                                System.out.println("Il pprodotto non è scaduto");
                            }
                        }
                    }
                    if(trovato){
                        System.out.println("prodotto non trovato");
                    }
                    break;
                case 4:
                    for(cont=0;cont<i;cont++){
                        c = 0;
                        for(cont1=0;cont1<elenco[cont].getcodice().length();cont1++){
                            if(elenco[cont].getcodice().charAt(cont1) == '0'){
                                c++;
                            }
                        }
                        System.out.println("Nel prodotto: \n");
                        elenco[cont].visualizza();
                        System.out.println("\nCi sono " + c + " cifre 0\n");;
                    }
                    break;
                case 5:
                    do{
                        ordinato = true;
                        for(cont = i-1;cont>=0; cont--){
                            if(elenco[cont].getcodice().compareTo(elenco[cont1-1].getcodice())<0){
                                temp = elenco[cont-1];
                                elenco[cont-1] = elenco[cont];
                                elenco[cont] = temp;
                                ordinato = false;
                            }
                        }
                        if(!ordinato){
                            ordinato = true;
                                for(cont1 = 0; cont<i-1; cont1++){
                                if(elenco[cont].getcodice().compareTo(elenco[cont+1].getcodice())>0){
                                    temp = elenco[cont-1];
                                    elenco[cont-1] = elenco[cont];
                                    elenco[cont] = temp;
                                    ordinato = false;
                                }
                            }
                        }
                    }while(!ordinato);
                    System.out.println("Array ordinato");
                    break;

                default:
                    System.out.println("Scelta non prevista");
            }
        }while(scelta!=0);
    }
}
