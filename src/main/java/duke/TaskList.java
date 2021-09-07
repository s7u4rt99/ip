package duke;

import duke.task.Task;

import java.util.ArrayList;

/**
 * Represents the list of Tasks for Duke.
 */
public class TaskList extends DukeList {
    /**
     * Constructor for TaskList.
     */
    public TaskList() {
        super();
    }

    /**
     * Constructor for TaskList, setting tasks to a given list.
     *
     * @param list List to be assigned to tasks.
     */
    public TaskList(ArrayList<Task> list) {
        super(list);
    }

//    /**
//     * Adds a new Task to tasks.
//     *
//     * @param toAdd Task to add to tasks.
//     */
//    @Override
//    public void add(Task toAdd) {
//        super.add(toAdd);
//    }

    /**
     * Getter for tasks.
     *
     * @return tasks.
     */
    public ArrayList<Task> getTasks() {
        return super.getTaskArrayList();
    }

//    /**
//     * Removes Task from given index from tasks.
//     *
//     * @param index Index of Task to remove from tasks.
//     * @return The removed Task.
//     */
//    @Override
//    public Task remove(int index) {
//        return super.remove(index);
//    }

//    /**
//     * Gets the size of tasks.
//     *
//     * @return Size of tasks.
//     */
//    @Override
//    public int getSize() {
//        return super.getSize();
//    }

//    /**
//     * Converts Task of a given index in tasks into its String representation.
//     *
//     * @param index Index of Task to get the String representation.
//     * @return String representation of Task in tasks with given index.
//     */
//    @Override
//    public String taskToString(int index) {
//        return super.taskToString(index);
//    }
//
//    /**
//     * Converts Task of a given index in tasks to its String representation to save.
//     *
//     * @param index Index of Task to get the String representation to save.
//     * @return String representation of Task in tasks with given index.
//     */
//    @Override
//    public String taskSaveToString(int index) {
//        return super.taskSaveToString(index);
//    }

    /**
     * Marks Task at given index in tasks as done.
     *
     * @param index Index of Task to mark as done.
     */
    public void markAsDone(int index) {
        super.get(index).markAsDone();
    }

    /**
     * Finds tasks with given keyword in tasks.
     *
     * @param keyword Keyword of tasks we want to find.
     * @return TaskList of Tasks with given keyword.
     */
    public TaskList findTasksWithKeyword(String keyword) {
        ArrayList<Task> tasksWithKeyword = new ArrayList<>();

        for (int i = 0; i < super.getSize(); i++) {
            if (super.get(i).hasKeyword(keyword)) {
                tasksWithKeyword.add(super.get(i));
            }
        }

        return new TaskList(tasksWithKeyword);
    }

    @Override
    public String type() {
        return "list";
    }

    //    /**
//     * Converts TaskList object into its String representation.
//     *
//     * @return String representation of TaskList object.
//     */
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
