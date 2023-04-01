package oop.lab.ooplab.message.focus.how.court.receptor;

import lombok.RequiredArgsConstructor;
import oop.lab.ooplab.message.focus.how.court.other.Testimony;
import oop.lab.ooplab.message.focus.how.court.other.TestifyMethod;

@RequiredArgsConstructor
public class Teacher implements Witness {

    @Override
    public Testimony testifyTomorrowVerballyWithTimeFocused() {
        return Testimony.of(
                TestifyMethod.ARGUMENT
        );
    }
}
