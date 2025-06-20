import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ElementoMultimediale[] elementimultimediali= new ElementoMultimediale[5];
        for(int i=0;i<elementimultimediali.length;i++){
            System.out.println("Creo elemento premendo 1 ,2 o 3 :  "+(i+1));

            Scanner scanner= new Scanner(System.in);
            int scelta = Integer.parseInt(scanner.nextLine());
            switch (scelta){
                case 1  : Immagine;
                        break;
                case 2 :Video;
            break;
                case 3:Audio;
                        break;
                default:
                    System.out.println("Scelta non opzionabile");

            }

        }
    }
}