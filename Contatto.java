class Contatto{
    String nome, cognome, cel, mail;
    int anni;

    public Contatto(String nome, String cognome, String cel, String mail, int anni){
        this.nome = nome;
        this.cognome = cognome;
        this.cel = cel;
        this.mail = mail;
        this.anni = anni;
    }

    void visualizza(){
        System.out.println("Nome: " + nome + " cognome: " + cognome + " Cellulare: " + cel + " mail:" + mail + " anni: " +anni);
    }
}