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
       int i;
    
        do{
            try{
                i = scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Inserire un numero");
                s = -1;
            }
        }while(s == -1);

        return i;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Rubrica> contatto = new Vector<Rubrica>(1,1);
        String cognome, nome, indirizzo_email;
        Int num, scelta = 0;
        Rubrica r = null;

        do{
            System.out.println("Premi 0 per uscire");
            scelta = Scanneri(input);
            switch(scelta){
                case 0:
                    break;
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta!=0);
    }
}