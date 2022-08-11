package ru.geekbrains.java_core.lesson1.homeWork.obstacleCourse;

import ru.geekbrains.java_core.lesson1.homeWork.team.TeamMember;

public class Swimming extends Obstacle {
    public Swimming(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}
