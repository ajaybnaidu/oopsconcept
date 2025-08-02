package collectionstasks;

import java.util.*;
import java.util.stream.Collectors;

class TeamMember {
    String name;
    String department;

    TeamMember(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class task18 {
    public static void main(String[] args) {
        List<TeamMember> team = Arrays.asList(
            new TeamMember("Alice", "HR"),
            new TeamMember("Bob", "IT"),
            new TeamMember("Charlie", "Finance"),
            new TeamMember("David", "IT"),
            new TeamMember("Eva", "HR")
        );
        Map<String, List<TeamMember>> groupedByDept = team.stream()
            .collect(Collectors.groupingBy(member -> member.department));
        System.out.println("Team Members grouped by department:");
        groupedByDept.forEach((dept, members) ->
            System.out.println(dept + ": " + members)
        );
    }
}

