import java.util.*;

public class TestOrario {
    public static String ScannerS(Scanner scanner){
        String s;
        do{
            try{
                s = scanner.nextLine();
            }catch(InputMismatchException e){
                s = "000";
                System.out.println("Non hai inserito una stringa");
            }
        }while(s.equals("000"));
        return s;
    }

    public static int ScannerI(Scanner scanner){
        int a = 0;
        do{
            try{
                a = scanner.nextInt();
                scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Inserisci un numero valido");
                a = 99;
            }
        }while(a == 99);

        return a;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int ore =0, min =0, sec =0, scelta = 0, cont = 0, alfa = 0;
        boolean solare = true;
        Orario r = null;
        Vector<Orario> lista = new Vector<Orario>(1, 1);
        
        do{
            System.out.println("Premi 0 per uscire");
            scelta = ScannerI(input);


            switch(scelta){
                case 0:
                    break;

                case 1:
                    System.out.println("inserisci il nome della città");
                    nome = ScannerS(input);
                    System.out.println("Dammi ore, minuti e secondi");
                    ore = ScannerI(input);
                    min = ScannerI(input);
                    sec = ScannerI(input);
                    r = new Orario(nome, ore, min, sec, solare);
                    lista.add(r);
                    break;
                case 2:
                    for(cont=0;cont<lista.size();cont++){
                        lista.get(cont).visualizza();
                    }
                    break;
                
                case 3:
                    for(cont=0;cont<lista.size();cont++){
                        lista.get(cont).legale();
                    }
                    break;
                case 4:
                    for(cont=0;cont<lista.size();cont++){
                        lista.get(cont).solare();
                    }
                    break;
                case 5:
                    alfa = 0;
                    System.out.println("inserisci il nome della città");
                    nome = input.nextLine();
                    for(cont=0;cont<lista.size();cont++){
                        if(nome.equals(lista.get(cont).nome)){
                            lista.get(cont).legale();
                            alfa = 99;
                        }
                    }
                    if(alfa == 0){
                        System.out.println("Città non trovato");
                    }
                    break;
                case 6:
                    System.out.println("inserisci il nome della città");
                    nome = input.nextLine();
                    for(cont=0;cont<lista.size();cont++){
                        if(nome.equals(lista.get(cont).nome)){
                            lista.get(cont).solare();
                            alfa = 99;
                        }
                    }
                    if(alfa == 0){
                        System.out.println("Città non trovata");
                    }
                    break;
                case 7:
                    System.out.println("inserisci il nome della città");
                    nome = input.nextLine();
                    for(cont=0;cont<lista.size();cont++){
                        if(nome.equals(lista.get(cont).nome)){
                            lista.remove(cont);
                            alfa = 99;
                        }
                    }
                    if(alfa == 0){
                        System.out.println("Città non trovata");
                    }
                    break;
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta!=0);
    }
}