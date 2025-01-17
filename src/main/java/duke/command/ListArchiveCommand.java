package duke.command;

import duke.ArchiveList;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Represents the list archive command on duke.
 */
public class ListArchiveCommand extends ListCommand {

    /**
     * Generates a ListArchiveCommand from the userInput.
     *
     * @return ListArchiveCommand to be executed.
     */
    public static ListArchiveCommand generateCommand() {
        return new ListArchiveCommand();
    }

    /**
     * Executes the ListArchiveCommand.
     *
     * @param taskList TaskList of Tasks which are unarchived.
     * @param archiveList ArchiveList of Tasks to be listed.
     * @param ui Ui to print to users of Duke.
     * @param storage Storage to save and load TaskList of Duke.
     */
    @Override
    public void execute(TaskList taskList, ArchiveList archiveList, Ui ui, Storage storage) {
        ui.print(archiveList);
    }

    /**
     * Gets the String representation of the things printed in the
     * execute method as well as execute list archive command.
     *
     * @param taskList TaskList of Tasks which are unarchived.
     * @param archiveList ArchiveList of Tasks to be listed.
     * @param ui Ui to get the String representation of the text printed.
     * @param storage Storage to save and load TaskList of Duke.
     * @return String representation of the things printed in the execute method.
     */
    @Override
    public String formatExecutedString(TaskList taskList, ArchiveList archiveList, Ui ui, Storage storage) {
        return ui.formatPrintString(archiveList);
    }
}
