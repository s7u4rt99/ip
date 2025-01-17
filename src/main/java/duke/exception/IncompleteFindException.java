package duke.exception;

/**
 * Represents the incomplete keyword for FindCommand exception.
 */
public class IncompleteFindException extends DukeException {
    /**
     * Represents the error message.
     */
    private static String MESSAGE = "OOPS!!! Please remember to key in keyword to find!";

    /**
     * Constructs a IncompleteFindException object.
     */
    public IncompleteFindException() {
        super(MESSAGE);
    }
}
