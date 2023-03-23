import java.util.*;

class testAuto {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String targa = "", x, z, seq = "000", targaa = "";
        int vel, acc, scelta = 0, i=0, cont=0, y=0, cont1 = 0, c = 0;
        Auto elenco[] =new Auto[500], temp, min;
        boolean valida = true;
        
        do{
            System.out.println("Premi 0 per uscire");
            System.out.println("Premi 1 per inserire nell’array di oggetti un nuovo oggetto della classe Auto prendendo in input la targa e la velocità attuale");
            System.out.println("premi 2 per visualizzare la targa e la velocità attuale di tutti le auto già create");
            System.out.println("premi 3 per accelerare o decelerare la velocità di un’auto (attraverso il metodo cambiavel), la cui targa è presa in input. L’ammontare della accelerazione (valore positivo) o della decelerazione (valore negativo) verrà a sua volta preso in input e passato come parametro al metodo. Dare un messaggio di errore se non esiste alcuna auto con la targa presa in input");
            System.out.println("premi 4 per verificare che nelle targhe presenti nell’array ci sia la sequenza di caratteri “000”. Per ogni targa indicare se questa sequenza è presente o no.");
            System.out.println("premi 5 per verificare se le targhe del’array di oggetti siano palindrome, cioè si leggono nello stesso modo sia da sinistra a destra che viceversa (esempi: “anna” o “ailatiditalia”). Per ogni targa indicare se è palindroma o no.");
            System.out.println("Premi 6 per verificare che tutte le targhe siano valide");
            scelta = input.nextInt();
            input.nextLine();
            switch(scelta){
                case 0:
                    break;
                case 1:
                    if(i<500){
                        valida = true;
                        System.out.println("Dammi la targa");
                        targa = input.nextLine();
                        targa = targa.toUpperCase();
                        if(targa.length()!=7){
                            valida=false;
                        }
                        System.out.println("Dammi la velocità");
                        vel = input.nextInt();
                        input.nextLine();
                        if(valida){
                            elenco[i] = new Auto(targa,vel);
                            i++;
                        }
                        
                    }else{
                        System.out.println("L'elenco è pieno");
                    }
                    break;
                case 2:
                    for(cont=0;cont<i;cont++){
                        System.out.println("Targa: " + elenco[cont].getTarga());
                        System.out.println("Velocità attuale: " + elenco[cont].getVel());
                    }
                    break;
                case 3:
                    System.out.println("Inserisci la targa dell'auto di cui vuoi cambiare la velocità");
                    x = input.nextLine();
                    x = x.toUpperCase();
                    for(cont=0;cont<i;cont++){
                        if(x.equals(elenco[cont].getTarga())){
                            System.out.println("Inserisci l'accelerazione o la decelerazione");
                            y = 99;
                            acc = input.nextInt();
                            input.nextLine();
                            elenco[cont].setVel(elenco[cont].cambiaVel(acc));
                        }
                    }
                    if(y!=99){
                        System.out.println("Non è stata trovata nessuna macchina con questa targa");
                    }
                    break;
                case 4:
                    for(cont=0;cont<i;cont++){
                        z = elenco[cont].getTarga().substring(2,5);
                        if(z.equals(seq)){
                            System.out.println("Nella targa è presente la stringa 000");
                            System.out.println(elenco[cont].getTarga());
                        }else{
                            System.out.println("Nella targa non è presente la stringa 000");
                            System.out.println(elenco[cont].getTarga());
                        }
                    }
                    break;
                case 5:
                    for(cont=0;cont<i;cont++){
                        targaa  = "";
                        for(cont1=7;cont1>=1;cont1--){
                            targaa = targaa + elenco[cont].getTarga().substring(cont1-1,cont1);
                        }
                        System.out.println(targaa);
                        if(targaa.equals(elenco[cont].getTarga())){
                            System.out.println("La targa " + elenco[cont].getTarga() + " è palindroma");
                        }else{
                            System.out.println("La targa " + elenco[cont].getTarga() + " non è palindroma");
                        }
                    }
                    break;
                case 6:
                    for(cont1=0;cont1<i;cont1++){
                        valida = true;
                        if(elenco[cont1].getTarga().length()!=7){
                            valida = false;
                        }
                            for(cont=0;cont<6;cont++){
                                if(elenco[cont1].getTarga().charAt(cont)>=('A')&&elenco[cont1].getTarga().charAt(cont)<=('Z')){
                                    if(cont>1&&cont<5){
                                        valida = false;
                                    }
                                    
                                }
                                if(elenco[cont1].getTarga().charAt(cont)>=('0')&&elenco[cont1].getTarga().charAt(cont)<=('9')){
                                    if(cont<2&&cont>4){
                                        valida = false;
                                    }
                                    
                                }
                                if(cont==5){
                                    if(valida){
                                        System.out.println(elenco[cont1].getTarga());
                                        System.out.println("la targa è valida");
                                    }
                                    else{
                                        System.out.println(elenco[cont1].getTarga());
                                        System.out.println("la targa non è valida");
                                    }
                                }   
                            }
                        }
                    break;
                case 7:
                    temp = elenco[0];
                    min = elenco[0];
                    for(cont = 1; cont<i;cont++){
                        if(temp.getTarga().compareTo(elenco[cont].getTarga())>0){
                            temp = elenco[cont];
                        }
                        if(temp.getTarga().compareTo(elenco[cont].getTarga())<0){
                            min = elenco[cont];
                        }
                    }
                    System.out.println("La prima targa in ordine alfabetico è " + temp.getTarga() + "\n" + temp.getVel());
                    System.out.println("L'ultima targa in ordine alfabetico è " + min.getTarga() + "\n" + min.getVel());
                    
                    break;
                
            }
        }while(scelta!=0);
    }
}
