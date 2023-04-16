class Rubrica{

    String cognome, nome, indirizzo_email;
    String num;
    
    public Rubrica(String cognome, String nome, String indirizzo_email,String num){
        this.cognome = cognome;
        this.nome = nome;
        this.indirizzo_email = indirizzo_email;
        this.num = num;
    }

    void visualizza(){
        System.out.println("Cognome: " + this.cognome);
        System.out.println("Nome: " + this.nome);
        System.out.println("Indirizzo mail: " + this.indirizzo_email);
        System.out.println("Numero di telefono: " + this.num);
    }
}