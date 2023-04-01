package oop.lab.ooplab.message.focus.how.court;

import oop.lab.ooplab.message.focus.how.court.other.JobOfWitness;
import oop.lab.ooplab.message.focus.how.court.receptor.SoccerPlayer;
import oop.lab.ooplab.message.focus.how.court.receptor.Student;
import oop.lab.ooplab.message.focus.how.court.receptor.Teacher;
import oop.lab.ooplab.message.focus.how.court.receptor.Witness;
import oop.lab.ooplab.message.focus.how.court.sender.KoreaCourtHouse;
import oop.lab.ooplab.message.focus.how.court.other.GovernmentPolicy;
import oop.lab.ooplab.message.focus.how.court.receptor.TeacherInfectedWithCovid19;

public class CourtAppConfig {
    private static JobOfWitness jobOfWitness;

    public static void initJobOfWitness(JobOfWitness input) {
        jobOfWitness = input;
    }

    private static GovernmentPolicy governmentPolicy() {
        return GovernmentPolicy.COVID_ALERT;
    }

    private static Witness witness() {
        switch (jobOfWitness) {
            case TEACHER:
                return new Teacher();
            case COVID_TEACHER:
                return new TeacherInfectedWithCovid19(governmentPolicy());
            case STUDENT:
                return new Student();
            case SOCCER_PLAYER:
                return new SoccerPlayer();
            default :
                throw new RuntimeException();
        }
    }

    public static KoreaCourtHouse courtHouse() {
        return new KoreaCourtHouse(witness());
    }
}
