package duke.exception;

import static duke.Ui.LINE;

/**
 * Representation for incomplete fields of Deadline exception.
 */
public class IncompleteDeadlineException extends DukeException {
    private static String MESSAGE = "OOPS!!! The description or date of a deadline cannot be empty.";

    /**
     * Constructor for IncompleteDeadlineException.
     */
    public IncompleteDeadlineException() {
        super(MESSAGE);
    }
}

