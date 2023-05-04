import java.util.*;

class App{
    public static String ecc(Scanner input){
        boolean ver = true;
        String s = "";
        do{
            try{
                ver = true;
                s = input.nextLine();
            }catch(InputMismatchException e){
                ver = false;
            }
        }while(!ver);
        return s;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome, cognome, cel, mail, iban;
        int anni, scelta, cont =0;
        Contatto c = null;
        ContattoImprese cc = null;
        Vector<ContattoImprese> Rubrica = new Vector<ContattoImprese>(1,1);
        do{
            System.out.println("Premi 0 per...");
            scelta = input.nextInt();
            input.nextLine();
            switch(scelta){
                case 0:
                    break;
                case 1:
                    System.out.println("Dammi tutto troia");
                    nome = ecc(input);
                    cognome = ecc(input);
                    cel = ecc(input);
                    mail = ecc(input);
                    anni = input.nextInt();
                    input.nextLine();
                    iban = ecc(input);
                    cc = new ContattoImprese(nome, cognome, cel, mail, anni, iban);
                    Rubrica.add(cc);
                    break;
                case 2:
                    for(cont = 0; cont<Rubrica.size(); cont++){
                        Rubrica.get(cont).visualizza();
                    }
                    break;
                case 3:
                    
                    break;
            }
        }while(scelta!=0);
    }
}