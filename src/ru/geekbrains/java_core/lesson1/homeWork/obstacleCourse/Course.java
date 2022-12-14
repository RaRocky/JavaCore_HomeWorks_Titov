package ru.geekbrains.java_core.lesson1.homeWork.obstacleCourse;


import ru.geekbrains.java_core.lesson1.homeWork.team.TeamMember;
import ru.geekbrains.java_core.lesson1.homeWork.Status;
import ru.geekbrains.java_core.lesson1.homeWork.team.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }

}
