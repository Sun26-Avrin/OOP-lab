package oop.lab.ooplab.message.focus.what.court.sender;

import lombok.RequiredArgsConstructor;
import oop.lab.ooplab.message.focus.what.court.other.Defendant;
import oop.lab.ooplab.message.focus.what.court.other.Sentence;
import oop.lab.ooplab.message.focus.what.court.other.Testimony;
import oop.lab.ooplab.message.focus.what.court.receptor.Witness;

/**
 * Scenario Origin
 * 1. 한국 법원은 1명의 증언만 듣고 판결함
 * 2. 증인은 증언을 하면 됨
 * */
@RequiredArgsConstructor
public class KoreaCourtHouse implements CourtHouse {
    public final Witness witness;

    public Sentence judge(Defendant defendant) {

        Testimony testimony = witness.testify();

        return new Sentence(defendant, testimony);
    }
}