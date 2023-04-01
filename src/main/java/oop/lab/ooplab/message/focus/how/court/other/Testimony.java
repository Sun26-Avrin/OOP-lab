package oop.lab.ooplab.message.focus.how.court.other;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
@Builder
@AllArgsConstructor
public class Testimony {
    private final LocalDateTime when = LocalDateTime.now().plusDays(1);
    private final TestifyFocus testifyFocus = TestifyFocus.TIME_FOCUSED;
    private final StatementMethod statementMethod = StatementMethod.VERBAL_STATEMENT;
    private TestifyMethod testifyMethod;

    public static Testimony of(
            TestifyMethod testifyMethod
    ) {
        return new Testimony(testifyMethod);
    }
}
