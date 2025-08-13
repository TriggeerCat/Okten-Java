package LessonCore04.Task03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "Alice", "Johnson", "alice.j@example.com", 28, Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skill("Java", 4), new Skill("Spring Boot", 2))),
                new Car("Toyota Corolla", 2018, 132));

        User u2 = new User(2, "Bob", "Smith", "bob.smith@example.com", 32, Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skill("Python", 5), new Skill("Django", 3))),
                new Car("Honda Civic", 2019, 158));

        User u3 = new User(3, "Charlie", "Lee", "charlie.lee@example.com", 25, Gender.NON_BINARY,
                new ArrayList<>(Arrays.asList(new Skill("JavaScript", 3), new Skill("TypeScript", 3), new Skill("React", 2))),
                new Car("Tesla Model 3", 2021, 283));

        User u4 = new User(4, "Diana", "Martinez", "diana.m@example.com", 29, Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skill("Kotlin", 4))),
                new Car("Hyundai Elantra", 2020, 147));

        User u5 = new User(5, "Ethan", "Brown", "ethan.b@example.com", 35, Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skill("Go", 3), new Skill("Microservices", 2))),
                new Car("Ford Mustang", 2017, 310));

        User u6 = new User(6, "Fiona", "Wang", "fiona.w@example.com", 27, Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skill("C#", 4), new Skill(".NET", 3))),
                new Car("Chevrolet Malibu", 2018, 160));

        User u7 = new User(7, "George", "Adams", "george.a@example.com", 40, Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skill("Ruby", 6), new Skill("Rails", 4))),
                new Car("BMW 3 Series", 2019, 255));

        User u8 = new User(8, "Hannah", "Nguyen", "hannah.n@example.com", 23, Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skill("Swift", 2), new Skill("iOS Development", 1))),
                new Car("Mazda 3", 2020, 186));

        User u9 = new User(9, "Ian", "Thompson", "ian.t@example.com", 31, Gender.MALE,
                new ArrayList<>(Arrays.asList(new Skill("PHP", 5), new Skill("Laravel", 3))),
                new Car("Audi A4", 2021, 261));

        User u10 = new User(10, "Jasmine", "Lopez", "jasmine.l@example.com", 26, Gender.FEMALE,
                new ArrayList<>(Arrays.asList(new Skill("TypeScript", 3), new Skill("Angular", 2))),
                new Car("Volkswagen Golf", 2019, 147));

        HashSet<User> usersHashSet = new HashSet<>(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));
        TreeSet<User> usersTreeSet = new TreeSet<>(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));

        System.out.println("-- HashSet -- \n");
        usersHashSet.forEach(System.out::println);
        System.out.println("-----");
        usersHashSet.removeIf(user -> user.getGender() == Gender.MALE);
        usersHashSet.forEach(System.out::println);

        System.out.println("\n-----\n");

        System.out.println("-- TreeSet -- \n");
        usersTreeSet.forEach(System.out::println);
        System.out.println("-----");
        usersTreeSet.stream().sorted((Comparator.comparingInt(o -> o.getSkills().size())))
                .toList().forEach(System.out::println);
    }
}