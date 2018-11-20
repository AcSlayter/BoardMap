package api.character;

import java.security.spec.ECFieldF2m;

/**
 * Created by aaron on 11/20/2018.
 */
public class ExceptionReturn  extends Exception {
    public ExceptionReturn() {
        super();
    }

    public ExceptionReturn(String message) {
        super(message);
    }
}
