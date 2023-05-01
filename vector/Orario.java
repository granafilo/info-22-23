class Orario {

    String nome;
    int ore = 0 , min = 0 ,sec = 0;
    boolean solare = true;

    public Orario(String nome, int ore, int min, int sec, boolean solare){
        this.nome = nome;
        this.ore = ore;
        this.min = min;
        this.sec = sec;
        this.solare = solare;
    }

    void visualizza(){
        System.out.println("Nome città: ");
        System.out.println("Ore: " + ore + " Minuti: " + min + " Secondi: " + sec);
        if(solare){
            System.out.println("L'ora è solare");
        }else{
            System.out.println("L'ora è legale");
        }
    }

    void legale(){
        if(solare){
            if(ore>=23){
                ore = 0;
            }else{
                ore += 1;
            }
            solare = false;
        }else{
            System.out.println("L'ora è già legale");
        }
    }

    void solare(){
        if(!solare){
            if(ore<=1){
                ore = 0;
            }else{
                ore -= 1;
            }
            solare = true;
        }else{
            System.out.println("L'ora è già solare");
        }
    }

}
