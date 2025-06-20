package entities;

import interfaces.regolaLuminosità;

public class Video extends ElementoMultimediale implements regolaLuminosità {


    @Override
    public String toString() {
        return "Video{} " + super.toString();
    }
}
