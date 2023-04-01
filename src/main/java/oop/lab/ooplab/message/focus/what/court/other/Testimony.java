package oop.lab.ooplab.message.focus.what.court.other;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class Testimony {
    private LocalDateTime when;
    private TestifyMethod testifyMethod;
    private TestifyFocus testifyFocus;
    private StatementMethod statementMethod;

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
