package ru.geekbrains.java_core.lesson1.homeWork.obstacleCourse;


import ru.geekbrains.java_core.lesson1.homeWork.team.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }

}
