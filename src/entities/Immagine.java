package entities;

import interfaces.regolaLuminosità;

public class Immagine extends ElementoMultimediale implements regolaLuminosità {
    private String titolo;
    private int luminosità;
    public Immagine(String titolo,int luminosità,boolean riproducibile) {
        super(titolo,riproducibile);
        this.luminosità=luminosità;
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo='" + titolo + '\'' +
                ", luminosità=" + luminosità +
                "} " + super.toString();
    }
}
