package anotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface OperatorSymbol {
    String symbol();
}
