package entities;

public class Audio extends ElementoMultimediale{

    private boolean riproducibile;


    //costruttori
    public Audio(int durata,boolean riproducibile) {
        super(durata);

        this.riproducibile=riproducibile;
    }


    public boolean isRiproducibile() {
        return riproducibile;
    }

    public void setRiproducibile(boolean riproducibile) {

        this.riproducibile = riproducibile;
    }

    if(int durata>0){}
}
