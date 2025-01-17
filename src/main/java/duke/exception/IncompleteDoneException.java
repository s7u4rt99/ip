package duke.exception;

/**
 * Represents the incomplete fields of Done exception.
 */
public class IncompleteDoneException extends DukeException {
    /**
     * Represents the error message.
     */
    private static String MESSAGE = "Please key in valid number to mark as done.";

    /**
     * Constructs a IncompleteDoneException object.
     */
    public IncompleteDoneException() {
        super(MESSAGE);
    }
}
