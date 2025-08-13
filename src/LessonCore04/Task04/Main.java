package LessonCore04.Task04;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Caroline");
        Person p2 = new Person(2, "Mykola");
        Person p3 = new Person(3, "Andrew");

        Zooclub zooclub = new Zooclub();
        zooclub.addPerson(p1);
        zooclub.addPerson(p1);
        zooclub.addPerson(p2);
        zooclub.addPerson(p3);
        System.out.println(zooclub);

        zooclub.addPetToPerson(p1, Pet.DOG);
        zooclub.addPetToPerson(p1, Pet.FISH);
        zooclub.addPetToPerson(p2, Pet.FISH);
        zooclub.addPetToPerson(p2, Pet.CAT);
        zooclub.addPetToPerson(p2, Pet.TURTLE);
        zooclub.addPetToPerson(p3, Pet.CAT);
        zooclub.addPetToPerson(p3, Pet.CAT);
        zooclub.addPetToPerson(p3, Pet.DOG);
        System.out.println(zooclub);

        zooclub.removePetFromPerson(p3, Pet.CAT);
        zooclub.removePetFromPerson(p2, Pet.FISH);
        System.out.println(zooclub);

        zooclub.removePerson(p2);
        System.out.println(zooclub);

        zooclub.removeOnePetFromAll(Pet.DOG);
        System.out.println(zooclub);
    }
}