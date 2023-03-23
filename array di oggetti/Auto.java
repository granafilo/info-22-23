/*
Scrivere una classe di nome Auto, i cui
attributi sono la targa e la velocità attuale. Nella classe definire un solo
costruttore che riceve come parametri la targa e la velocità attuale (cioè la
velocità attuale dell’auto al momento in cui viene creato l’oggetto). Infine
definire un metodo cambiavel che
modifica la velocità attuale a causa di una accelerazione o di una
decelerazione. Il metodo riceve come parametro il valore dell’accelerazione
(valore positivo) o della decelerazione (valore negativo). La velocità attuale non può essere negativa o maggiore di 130
e prevedere un messaggio di errore in tali casi senza cambiare la velocità
attuale.
*/

class Auto {
    private String targa;
    private int vel;

    public Auto(String targa, int vel){
        this.targa = targa;
        this.vel = vel;
    }

    int cambiaVel(int acc){
        if((vel + acc<0)||(vel+acc>130)){
            System.out.println("La velocità non può essere negativa o superiore a 130 Km/h");
        }else{
            vel+= acc;
        }
        return vel;
    }

    String getTarga(){
        return targa;
    }

    int getVel(){
        return vel;
    }

    void setTarga(String targa){
        this.targa = targa;
    }

    void setVel(int vel){
        this.vel = vel;
    }

}
