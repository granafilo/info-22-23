class ContattoImprese extends Contatto{
    String iban;

    public ContattoImprese(String nome, String cognome, String cel, String mail, int anni, String iban){
        super(nome, cognome, cel, mail, anni);
        this.iban = iban;
    }

    void visualizza(){
        super.visualizza();
        System.out.println("Iban: " + iban);
    }
}