package oop.lab.ooplab.message.focus.how.court.receptor;

import lombok.RequiredArgsConstructor;
import oop.lab.ooplab.message.focus.how.court.other.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class TeacherInfectedWithCovid19 extends Teacher implements WitnessInfectedWithCovid19 {
    private final GovernmentPolicy governmentPolicy;

    @Override
    public Testimony testifyTomorrowVerballyWithTimeFocused() {
        switch (governmentPolicy){
            case DAILY:
            case COVID_ALERT:
                return testifyTodayInWriting();
            default:
                return super.testifyTomorrowVerballyWithTimeFocused();
        }
    }

    @Override
    public Testimony testifyTodayInWriting() {
        return Testimony.of(
                LocalDateTime.now(),
                TestifyMethod.ARGUMENT,
                TestifyFocus.TIME_FOCUSED,
                StatementMethod.WRITTEN_STATEMENT
        );
    }
}
