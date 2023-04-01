package oop.lab.ooplab.message.focus.what.court;

import oop.lab.ooplab.message.focus.what.court.other.GovernmentPolicy;
import oop.lab.ooplab.message.focus.what.court.other.JobOfWitness;
import oop.lab.ooplab.message.focus.what.court.receptor.*;
import oop.lab.ooplab.message.focus.what.court.sender.KoreaCourtHouse;

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
