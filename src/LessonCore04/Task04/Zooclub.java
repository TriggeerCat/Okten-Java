package LessonCore04.Task04;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@ToString
public class Zooclub {
    private final Map<Person, List<Pet>> club;

    Zooclub() {
        club = new TreeMap<>();
    }

    void addPerson(Person person) {
        club.put(person, new ArrayList<>());
    }

    void addPetToPerson(Person person, Pet petId) {
        if (club.containsKey(person)) {
            List<Pet> updatedList = club.get(person);
            updatedList.add(petId);
            club.replace(person, updatedList);
        }
    }

    void removePetFromPerson(Person person, Pet petId) {
        if (club.containsKey(person)) {
            List<Pet> updatedList = club.get(person);
            updatedList.remove(petId);
            club.replace(person, updatedList);
        }
    }

    void removePerson(Person person) {
        club.remove(person);
    }

    void removeOnePetFromAll(Pet petId) {
        club.forEach((c, l) -> {
            l.remove(petId);
            club.replace(c, l);
        });
    }
}
