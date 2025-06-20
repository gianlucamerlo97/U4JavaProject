package entities;

public abstract class ElementoMultimediale {
    //attributi
    private String titolo;
    private boolean riproducibile;

    //COSTRUTTORI
    public ElementoMultimediale(String titolo,boolean riproducibile){
    this.titolo=titolo;
    this.riproducibile=riproducibile;


    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public boolean isRiproducibile() {
        return riproducibile;
    }

    public void setRiproducibile(boolean riproducibile) {
        this.riproducibile = riproducibile;
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                ", riproducibile=" + riproducibile +
                '}';
    }

    //metodi


    public static void play(){

    }
}
