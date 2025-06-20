package entities;

public class Audio extends ElementoMultimediale{

    private boolean riproducibile;
    private int volume;
    private int ripetizioni;

    //costruttori
    public Audio(String titolo,int durata,boolean riproducibile,int volume,int ripetizioni) {
        super(titolo);
        this.volume=volume;
        this.riproducibile=riproducibile;
    }


    public boolean isRiproducibile() {
        return riproducibile;
    }

    public void setRiproducibile(boolean riproducibile) {

        this.riproducibile = riproducibile;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRipetizioni() {
        return ripetizioni;
    }

    public void setRipetizioni(int ripetizioni) {
        this.ripetizioni = ripetizioni;
    }

    for(int i=0;i<.length;)

    //metodi
    public int alzaVolume(){
        return volume++;
    }


    public int abbassaVolume(){
        return volume--;
    }
}
