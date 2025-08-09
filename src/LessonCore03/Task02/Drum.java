package LessonCore03.Task02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drum implements Instrument {
    int size;

    @Override
    public void play() {
        System.out.println("The drum was played with size of " + size + " units");
    }
}
