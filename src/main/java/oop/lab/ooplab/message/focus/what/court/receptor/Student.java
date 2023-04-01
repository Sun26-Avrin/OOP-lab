package oop.lab.ooplab.message.focus.what.court.receptor;

import oop.lab.ooplab.message.focus.what.court.other.StatementMethod;
import oop.lab.ooplab.message.focus.what.court.other.TestifyFocus;
import oop.lab.ooplab.message.focus.what.court.other.TestifyMethod;
import oop.lab.ooplab.message.focus.what.court.other.Testimony;

import java.time.LocalDateTime;

public class Student implements Witness {
    @Override
    public Testimony testify() {
        return Testimony.of(
                LocalDateTime.now().plusWeeks(3),
                TestifyMethod.DESCRIPTION,
                TestifyFocus.CHARACTER_FOCUSED,
                StatementMethod.WRITTEN_STATEMENT
        );
    }
}
