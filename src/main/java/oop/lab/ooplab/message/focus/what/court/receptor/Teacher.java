package oop.lab.ooplab.message.focus.what.court.receptor;

import oop.lab.ooplab.message.focus.what.court.other.StatementMethod;
import oop.lab.ooplab.message.focus.what.court.other.TestifyFocus;
import oop.lab.ooplab.message.focus.what.court.other.TestifyMethod;
import oop.lab.ooplab.message.focus.what.court.other.Testimony;

import java.time.LocalDateTime;

public class Teacher implements Witness{

    @Override
    public Testimony testify() {
        return Testimony.of(
                LocalDateTime.now().plusDays(2),
                TestifyMethod.ARGUMENT,
                TestifyFocus.TIME_FOCUSED,
                StatementMethod.VERBAL_STATEMENT
        );
    }
}
