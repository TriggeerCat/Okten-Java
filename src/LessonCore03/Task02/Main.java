package LessonCore03.Task02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();

        instruments.add(new Drum(1));
        instruments.add(new Drum(3));
        instruments.add(new Guitar(4));
        instruments.add(new Tube(8));

        Instrument instrument0 = instruments.getFirst();
        Instrument instrument1 = instruments.get(1);
        Instrument instrument2 = instruments.get(2);
        Instrument instrument3 = instruments.get(3);

        instrument0.play();
        instrument1.play();
        instrument2.play();
        instrument3.play();
    }
}
