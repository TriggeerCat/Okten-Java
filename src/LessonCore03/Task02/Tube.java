package LessonCore03.Task02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tube implements Instrument {
    int diameter;

    @Override
    public void play() {
        System.out.println("The tube was played with diameter of " + diameter + " units");
    }
}
