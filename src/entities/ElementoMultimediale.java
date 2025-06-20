package entities;

public abstract class ElementoMultimediale {

    //attributi
    private String titolo;


    //COSTRUTTORI
    public ElementoMultimediale(String titolo){
    this.titolo=titolo;


    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }


    //metodi


    public static void play(){

    }
}
