package entities;

public abstract class ElementoMultimediale {
    private String titolo;


    //COSTRUTTORI
    public ElementoMultimediale(int titolo){



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
