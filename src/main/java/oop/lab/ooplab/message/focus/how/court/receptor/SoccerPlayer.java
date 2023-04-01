package oop.lab.ooplab.message.focus.how.court.receptor;

import lombok.RequiredArgsConstructor;
import oop.lab.ooplab.message.focus.how.court.other.TestifyMethod;
import oop.lab.ooplab.message.focus.how.court.other.Testimony;

@RequiredArgsConstructor
public class SoccerPlayer implements Witness {

    @Override
    public Testimony testifyTomorrowVerballyWithTimeFocused() {
        return Testimony.of(
                TestifyMethod.ARGUMENT
        );
    }
}
