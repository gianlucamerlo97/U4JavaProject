package entities;

import interfaces.play;
import interfaces.regolaLuminosità;

public class Video extends ElementoMultimediale implements regolaLuminosità, play {


    public Video(String titolo, boolean riproducibile) {
        super(titolo, riproducibile);
    }

    @Override
    public String toString() {
        return "Video{} " + super.toString();
    }
    @Override
    public void regolaLuminosità(){}
    @Override
    public void volumeModifica(){

    }
}
