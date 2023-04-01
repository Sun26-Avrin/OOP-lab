package oop.lab.ooplab.message.focus.what.court.sender;

import lombok.RequiredArgsConstructor;
import oop.lab.ooplab.message.focus.what.court.other.Defendant;
import oop.lab.ooplab.message.focus.what.court.other.Sentence;
import oop.lab.ooplab.message.focus.what.court.other.Testimony;
import oop.lab.ooplab.message.focus.what.court.receptor.Witness;

/**
 * @Description Scenario Origin
 * @item 1. 한국 법원은 1명의 증언만 듣고 판결함
 * @item 2. 증인은 증언을 하면 됨

 * @Description Scenario Added
 * @item 1. 코로나에 걸린 증인들은 증언을 `오늘` 모두 `서면 제출`하여야 함
 * @item 2. 3주일 뒤부터 코로나에 걸린 증인들도 일반증인과 똑같이 행동할 수 있음
 * @item 3. 지침은 언제든지 바뀔 수 있음
 * */
@RequiredArgsConstructor
public class KoreaCourtHouse implements CourtHouse {
    public final Witness witness;

    public Sentence judge(Defendant defendant) {

        Testimony testimony = witness.testify();

        return new Sentence(defendant, testimony);
    }
}