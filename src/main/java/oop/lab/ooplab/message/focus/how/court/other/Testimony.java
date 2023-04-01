package oop.lab.ooplab.message.focus.how.court.other;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
@Builder
@AllArgsConstructor
public class Testimony {
    private LocalDateTime when;
    private TestifyFocus testifyFocus;
    private StatementMethod statementMethod;
    private TestifyMethod testifyMethod;

    public static Testimony of(
            TestifyMethod testifyMethod
    ) {
        return Testimony.builder()
                .when(LocalDateTime.now().plusDays(1))
                .testifyMethod(testifyMethod)
                .testifyFocus(TestifyFocus.TIME_FOCUSED)
                .statementMethod(StatementMethod.VERBAL_STATEMENT)
                .build();
    }

    public static Testimony of(
            LocalDateTime when,
            TestifyMethod testifyMethod,
            TestifyFocus testifyFocus,
            StatementMethod statementMethod
    ) {
        return Testimony.builder()
                .when(when)
                .testifyMethod(testifyMethod)
                .testifyFocus(testifyFocus)
                .statementMethod(statementMethod)
                .build();
    }
}
