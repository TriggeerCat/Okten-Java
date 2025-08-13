package LessonCore04.Task01;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();

        users.add(new User("vasya", 28));
        users.add(new User("petya", 30));
        users.add(new User("mykola", 29));
        users.add(new User("olga", 31));

        System.out.println(users);

        System.out.println("-----");

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(users);
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(users);

        System.out.println("-----");

        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println(users);
        users.sort(Comparator.comparingInt(o -> -o.getName().length()));
        System.out.println(users);
    }
}