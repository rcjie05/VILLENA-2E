package villena.pkg2e;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<Task> taskList;

    public Tasks() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void displayTasks() {
        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }
}