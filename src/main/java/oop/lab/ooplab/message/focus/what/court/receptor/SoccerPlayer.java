package oop.lab.ooplab.message.focus.what.court.receptor;

import oop.lab.ooplab.message.focus.what.court.other.StatementMethod;
import oop.lab.ooplab.message.focus.what.court.other.TestifyFocus;
import oop.lab.ooplab.message.focus.what.court.other.TestifyMethod;
import oop.lab.ooplab.message.focus.what.court.other.Testimony;

import java.time.LocalDateTime;

public class SoccerPlayer implements Witness{
    @Override
    public Testimony testify() {
        return Testimony.of(
                LocalDateTime.now().plusHours(5),
                TestifyMethod.ARGUMENT,
                TestifyFocus.OFF_THE_TOP_OF_THE_HEAD,
                StatementMethod.VERBAL_STATEMENT
        );
    }
}
