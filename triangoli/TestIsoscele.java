import java.util.*;



class TestIsoscele{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lato1=0, lato2=0, lato3=0, altezza=0, scelta = 0;
        Isoscele t1 = null;
        boolean corr = true, pieno = false, baseCheck = false, pCheck = false, areaCheck = false, lCheck = true;
        do{
            do{
                lCheck = true;
                System.out.println("\n0. esci");
                System.out.println("1. crea triangolo");
                System.out.println("2. per visualizzare il triangolo");
                System.out.println("3. per verificare se è un triangolo");
                System.out.println("4. per verificare che il triangolo sia isoscele");
                System.out.println("5. per individuare la base e il lato obliquo");
                System.out.println("6. per calcolare il perimetro del triangolo");
                System.out.println("7. per calcolare l'area del triangolo\n");
                try{
                    scelta = input.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("devi inserire un numero");
                    lCheck = false;
                }
                    input.nextLine();
            }while(!lCheck);
            
            switch(scelta){

                case 0:
                    break;

                case 1:
                    pieno = false;
                    do{
                        corr = true;
                        do{
                            lCheck = true;
                            System.out.println("Inserisci il primo lato");
                            try{
                               lato1 = input.nextInt();
                            }
                            catch(InputMismatchException e){
                               System.out.println("devi inserire un numero");
                               lCheck = false;
                            }
                            input.nextLine();
                        }while(!lCheck);
                        System.out.println("Inserisci il secondo lato");
                        try{
                            lato2 = input.nextInt();
                         }
                         catch(InputMismatchException e){
                            System.out.println("devi inserire un numero");
                        }
                        input.nextLine();
                        System.out.println("Inserisci il terzo lato");
                        try{
                            lato3 = input.nextInt();
                         }
                         catch(InputMismatchException e){
                            System.out.println("devi inserire un numero");
                         }
                        input.nextLine();
                        System.out.println("Inserisci l'altezza");
                        try{
                            altezza = input.nextInt();
                        }
                        catch(InputMismatchException e){
                        System.out.println("devi inserire un numero");
                        }
                        input.nextLine();
                        if(lato1 <1 || lato2 <1 || lato3<1 || altezza<1){
                           corr = false;
                           System.out.println("un dato inserito è minore di 1, reinserisci i dati e verifica che siano maggiori o uguali a 1");
                           }
                    }while(!corr);
                    t1 = new Isoscele (lato1, lato2, lato3, altezza);
                    pieno = true;
                    break;

                case 2:
                    if(pieno){
                        t1.visualizza(baseCheck, pCheck, areaCheck);
                    }else{
                        System.out.println("Prima premi 1 e crea un'oggetto");
                    }
                break;
                
                case 3:
                    if(pieno){
                        if(t1.isTri()){
                            System.out.println("L'oggetto creato è un triangolo");
                        }else{
                            System.out.println("L'oggetto creato non è un triangolo");
                        }
                    }else{
                        System.out.println("Prima premi 1 e crea un'oggetto");
                    }    
                break;
                
                case 4:
                    if(pieno){
                        if(t1.isIsoscele()){
                            System.out.println("L'oggetto creato è un triangolo isoscele");
                        }else{
                            System.out.println("L'oggetto creato non è un triangolo isoscele");
                        }
                    }else{
                        System.out.println("Prima premi 1 e crea un'oggetto");
                    }
                break;
                
                case 5:
                    baseCheck = false;
                    if(pieno){
                       t1.calcolaBase();
                       baseCheck = true;
                    }else{
                        System.out.println("Prima premi 1 e crea un'oggetto");
                    }
                break;
                
                case 6:
                    pCheck = false;
                    if(pieno){
                        if(baseCheck){
                             System.out.println("Perimetro: " + t1.perimetro());
                             pCheck = true;
                        }else{
                            System.out.println("Prima individua la base e i lati obliqui");
                        }
                    }else{
                        System.out.println("Prima premi 1 e crea un'oggetto");
                    }
                break;
                
                case 7:
                    areaCheck = false;
                    if(pieno){
                        if(baseCheck){
                             System.out.println("Area: " + t1.area());
                             areaCheck = true;
                        }else{
                           System.out.println("Prima individua la base e i lati obliqui");
                        }  
                    }else{
                        System.out.println("Prima premi 1 e crea un'oggetto");
                    }
                break;
                    
                default:
                    System.out.println("Scelta non prevista");
                break;
                
                }
        }while(scelta!=0);

    }
}