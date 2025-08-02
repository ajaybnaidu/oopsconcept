package collectionstasks;

import java.util.*;

class Participant {
    String id;
    String name;
    int score;
    Participant(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " (" + id + ") - " + score;
    }
}

public class task15 {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<>();
        participants.add(new Participant("P101", "Alice", 85));
        participants.add(new Participant("P102", "Bob", 78));
        participants.add(new Participant("P103", "Charlie", 90));
        Map<String, Participant> participantMap = new HashMap<>();

        for (Participant p : participants) {
            participantMap.put(p.id, p);
        }
        System.out.println("Participant Map (ID -> Participant):");
        for (Map.Entry<String, Participant> entry : participantMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
