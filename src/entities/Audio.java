package entities;

import interfaces.volumeModifica;

public class Audio extends ElementoMultimediale{


    private int volume;
    private int ripetizioni;

    //costruttori
    public Audio(String titolo,int durata,int volume,int ripetizioni,boolean riproducibile) {
        super(titolo,riproducibile);
        this.volume=volume;
    this.ripetizioni=ripetizioni;
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

    @Override
    public String toString() {
        return "Audio{" +
                "volume=" + volume +
                ", ripetizioni=" + ripetizioni +
                "} " + super.toString();
    }

    //metodi
    public int alzaVolume(){
        return volume++;
    }


    public int abbassaVolume(){
        return volume--;
    }


    }
}
}
