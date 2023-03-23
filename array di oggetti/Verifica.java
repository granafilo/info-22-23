class Verifica {
    private String codice;
    private int giorno, mese;
    private float costo;
    boolean test = false;

    public Verifica(String codice, int giorno, int mese, float costo){
        this.codice = codice;
        this.giorno = giorno;
        this.mese = mese;
        this.costo = costo;
    }

    String getcodice(){
        return codice;
    }
    int getgiorno(){
        return giorno;
    }

    int getMese(){
        return mese;
    }

    float getCosto(){
        return costo;
    }

    boolean verificaScadenza(int giorno_c, int mese_c){
        if(mese_c > mese){
            test = true;
        }else{
            if(mese_c == mese){
                if(giorno_c>giorno){
                    test = true;
                }
            }
        }
        return test;
    }
    void visualizza(){
        System.out.println("Codice: " + this.codice + "\nGiorno: " + this.giorno + "\tMese: " + this.mese + "\nCosto: " + this.costo);
    }
}
