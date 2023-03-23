import java.util.*;

class TestEquilatero{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Equilatero t1 = null;
        double a;
        int scelta,lato1, p;
        do{
            System.out.println("premi 0 per uscire");
            System.out.println("premi 1 per creare un triangolo");
            System.out.println("premi 2 per visualizzare i lati");
            System.out.println("premi 3 per dire se e' un triangolo");
            System.out.println("premi 4 per calcolare l'altezza");
            System.out.println("premi 5 per calcolare il perimetro");
            System.out.println("premi 6 per calcolare l'area");
            scelta = input.nextInt();
            input.nextLine();

            switch(scelta){
                case 0: break;

                case 1:
                    do{
                        System.out.println("Inserisci il lato del triangolo");
                        lato1 = input.nextInt();
                        input.nextLine();
                        t1 =new Equilatero(lato1);
                    }while(lato1 < 1);
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
                            System.out.println("i lati sono OK e la loro misura e':"+t1.lato1);
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
                        a = t1.calcolaAltezza();
                        System.out.println("Altezza = " + a);
                    }else{
                        System.out.println("prima premi 1");
                    }
                    break;

                case 5:
                    if(t1!=null){
                        p = t1.perimetro();
                        System.out.println("Perimetro = " + p);
                    }else{
                        System.out.println("prima premi 1");
                    }
                    break;

                case 6:
                    if(t1!=null){
                        a = t1.area();
                        System.out.println("Perimetro = " + a);
                    }else{
                        System.out.println("prima premi 1");
                    }
                    break;
                
                default:
                    System.out.println("Scelta non prevista");
            }        
        }while(scelta!=0);
    }
}