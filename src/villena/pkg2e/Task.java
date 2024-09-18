package villena.pkg2e;
      
public class Task {
    int taskId;
    String taskName;
    String assignedTo;
    String dueDate;
    String priority;
    String status;

    public Task(int taskId, String taskName, String assignedTo, String dueDate, String priority, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    public String toString() {
        return "Task ID: " + taskId +
               "\nTask Name: " + taskName +
               "\nAssigned To: " + assignedTo +
               "\nDue Date: " + dueDate +
               "\nPriority: " + priority +
               "\nStatus: " + status + "\n";
    }
}