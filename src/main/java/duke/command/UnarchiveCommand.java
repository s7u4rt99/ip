package duke.command;

import duke.ArchiveList;
import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

/**
 * Representation for the unarchive command on duke.
 */
public class UnarchiveCommand extends Command {
    private final int indexToUnarchive;
    private final boolean isUnarchiveAll;

    /**
     * Constructor for UnarchiveCommand.
     *
     * @param indexToUnarchive index of task to be unarchived.
     */
    public UnarchiveCommand(int indexToUnarchive) {
        this.indexToUnarchive = indexToUnarchive;
        this.isUnarchiveAll = indexToUnarchive == -1;
    }

    /**
     * Checks if this is an exit command.
     *
     * @return false.
     */
    @Override
    public boolean isExit() {
        return false;
    }

    /**
     * Executes the Unarchive Command.
     *
     * @param taskList taskList to store the unarchived task.
     * @param archiveList archiveList which task at indexToUnarchive would be unarchived.
     * @param ui Ui to get the String representation of the text printed.
     * @param storage Storage to save and load TaskList for Duke.
     */
    @Override
    public void execute(TaskList taskList, ArchiveList archiveList, Ui ui, Storage storage) {
        String message;

        if (this.isUnarchiveAll) {
            message = formatAndUnarchiveAll(taskList, archiveList);

        } else {
            message = formatAndUnarchiveIndex(taskList, archiveList);

        }
        ui.print(message);
    }
    /**
     * Gets the String representation of the things printed in the
     * execute method as well as execute the Unarchiving of the task at
     * indexToBeArchived.
     *
     * @param taskList taskList to store the unarchived task.
     * @param archiveList archiveList which task at indexToUnarchive would be unarchived.
     * @param ui Ui to get the String representation of the text printed.
     * @param storage Storage to save and load TaskList for Duke.
     */
    @Override
    public String formatExecutedString(TaskList taskList, ArchiveList archiveList, Ui ui, Storage storage) {
        String message;

        if (this.isUnarchiveAll) {
            message = formatAndUnarchiveAll(taskList, archiveList);

        } else {
            message = formatAndUnarchiveIndex(taskList, archiveList);

        }
        return message;
    }

    /**
     * Formats and unarchive task at indexToUnarchive in archiveList.
     *
     * @param taskList taskList to add the unarchived task to.
     * @param archiveList archiveList to unarchive the task.
     * @return Returns formatted String to be printed to the user.
     */
    private String formatAndUnarchiveIndex(TaskList taskList, ArchiveList archiveList) {
        Task toUnarchive = archiveList.unarchive(indexToUnarchive, taskList);

        return "Noted. I've unarchived this task:\n" + toUnarchive + "\nNow you have "
                + archiveList.getSize() + " tasks in the archive list.";
    }

    /**
     * Formats and archive all tasks in taskList.
     *
     * @param taskList taskList to add all unarchived tasks to.
     * @param archiveList archiveList to unarchive all the tasks.
     * @return Returns formatted String to be printed to the user.
     */
    private String formatAndUnarchiveAll(TaskList taskList, ArchiveList archiveList) {
        String message = "Noted. I've unarchived these tasks:\n";

        int counter = 0;
        int size = archiveList.getSize();

        for (int i = 0; i < size; i++) {
            Task toUnarchive = archiveList.unarchive(0, taskList);
            counter++;
            message += counter + "." + toUnarchive + "\n";
        }

        message += "Now you have 0 tasks in the archive list.";
        return message;
    }
}
