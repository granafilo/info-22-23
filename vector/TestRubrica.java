import java.util.*;

public class TestRubrica{
    public static String Scanners(Scanner scanner){
        String s;
        do{
            try{
                s = scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Inserire una stringa valida");
                s = "000";
            }
        }while(s.equals("000"));
        return s;
    }

    public static int Scanneri(Scanner scanner){
        int i = 0;
        do{
            try{
                i = scanner.nextInt();
                scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Inserire un numero");
                i = -1;
            }
        }while(i == -1);

        return i;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Rubrica> contatto = new Vector<Rubrica>(1,1);
        String cognome, nome, indirizzo_email, c ,n;
        int num, scelta = 0, i=0, cont = 0;
        boolean a = false;
        Rubrica r = null;

        do{
            i = contatto.size();
            System.out.println("Premi 0 per uscire");
            scelta = Scanneri(input);
            

            switch(scelta){
                case 0:
                    break;

                case 1:
                    System.out.println("Dammi il cognome");
                    cognome = Scanners(input);
                    System.out.println("Dammi il nome");
                    nome = Scanners(input);
                    System.out.println("Dammi l'inidirizzo email");
                    indirizzo_email = Scanners(input);
                    System.out.println("Dammi il numero di telefono");
                    num = Scanneri(input);
                    r = new Rubrica(cognome, nome, indirizzo_email, num);
                    contatto.add(r);
                    break;
                
                case 2:
                    for(cont = 0; cont<i; cont++){
                        contatto.get(cont).visualizza();
                    }
                    break;
                case 3:
                    System.out.println("Dammi il cognome del contatto da eliminare");
                    c = Scanners(input);
                    System.out.println("Dammi il nome del contatto da eliminare");
                    n = Scanners(input);
                    for(cont = 0; cont<i; cont++){
                        if(contatto.get(cont).cognome.equals(c) && contatto.get(cont).nome.equals(n)){
                            contatto.remove(cont);
                            a = true;
                            System.out.println("Contatto eliminato");
                        }
                    }
                    if(!a){
                        System.out.println("contatto non trovato");
                    }

                    break;
                case 4:
                    //modificare contatto con sottomenu a partire da nome e cognome
                    break;
                
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta!=0);
    }
}