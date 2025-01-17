package duke.command;

import duke.exception.IncompleteToDoException;
import duke.task.ToDo;

/**
 * Represents the AddToDoCommand of Duke.
 */
public class AddToDoCommand extends AddCommand {

    /**
     * Constructs a AddToDoCommand object to add given ToDo Task.
     *
     * @param toAdd ToDo Task to add to taskList.
     */
    public AddToDoCommand(ToDo toAdd) {
        super(toAdd);
    }

    /**
     * Generates a AddToDoCommand from the userInput.
     *
     * @param userInput User Input which is used to generate the AddToDoCommand.
     * @return AddToDoCommand to be executed.
     * @throws IncompleteToDoException if insufficient values are passed in.
     */
    public static AddToDoCommand generateCommand(String userInput) throws IncompleteToDoException {
        String[] str = splitToDoInput(userInput);

        assert str.length == 1;

        ToDo add = new ToDo(str[0]);
        return new AddToDoCommand(add);
    }

    /**
     * Splits string which contains a description for the ToDo object.
     *
     * @param input Input which contains a description of the ToDo Object
     * @return String[] containing the description at index 0.
     * @throws IncompleteToDoException If no description for ToDo objects.
     */
    public static String[] splitToDoInput(String input) throws IncompleteToDoException {
        String[] str = input.split(SPACE);

        if (str.length == 1) {
            throw new IncompleteToDoException();
        } else {
            String description = getDescription(str);
            return new String[]{description};
        }
    }

}
