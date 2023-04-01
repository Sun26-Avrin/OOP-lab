package oop.lab.ooplab.message.focus.how.court;

import oop.lab.ooplab.message.focus.how.court.other.Defendant;
import oop.lab.ooplab.message.focus.how.court.other.Sentence;
import oop.lab.ooplab.message.focus.how.court.sender.KoreaCourtHouse;
import oop.lab.ooplab.message.focus.how.court.other.JobOfWitness;

import static oop.lab.ooplab.message.focus.how.court.other.JobOfWitness.COVID_TEACHER;

public class CourtApp {
    public static void main(String[] args) {
        JobOfWitness input = COVID_TEACHER;
        CourtAppConfig.initJobOfWitness(input);
        KoreaCourtHouse koreaCourtHouse = CourtAppConfig.courtHouse();
        Sentence sentence = koreaCourtHouse.judge(new Defendant());
        doSentence(sentence);
    }

    public static void doSentence(Sentence sentence) {
        System.out.println(sentence);
    }
}
