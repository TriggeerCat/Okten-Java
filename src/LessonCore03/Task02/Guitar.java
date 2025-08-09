package LessonCore03.Task02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Guitar implements Instrument {
    int stringCount;

    @Override
    public void play() {
        System.out.println("The guitar was played with " + stringCount + " string(s)");
    }
}
