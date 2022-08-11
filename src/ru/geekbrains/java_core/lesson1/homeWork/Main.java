package ru.geekbrains.java_core.lesson1.homeWork;

import ru.geekbrains.java_core.lesson1.homeWork.obstacleCourse.*;
import ru.geekbrains.java_core.lesson1.homeWork.team.Team;
import ru.geekbrains.java_core.lesson1.homeWork.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Команда Чемпионов",
                new TeamMember("Участник №1", 4),
                new TeamMember("Участник №2", 5),
                new TeamMember("Участник №3", 6),
                new TeamMember("Участник №4" ,7));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(6),
                new Jumping(5));

        course.doIt(dreamTeam);
        dreamTeam.showResults();

    }
}
