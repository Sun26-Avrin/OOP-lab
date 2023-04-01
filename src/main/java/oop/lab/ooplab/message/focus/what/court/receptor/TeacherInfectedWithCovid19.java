package oop.lab.ooplab.message.focus.what.court.receptor;

import lombok.RequiredArgsConstructor;
import oop.lab.ooplab.message.focus.what.court.other.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class TeacherInfectedWithCovid19 extends Teacher implements WitnessInfectedWithCovid19{
    private final GovernmentPolicy governmentPolicy;

    @Override
    public Testimony testify() {
        switch (governmentPolicy){
            case DAILY:
            case COVID_ALERT:
                return testifyTodayInWriting();
            default:
                return super.testify();
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
