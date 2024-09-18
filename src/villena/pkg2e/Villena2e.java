package villena.pkg2e;


import java.util.Scanner;

public class Villena2e {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tasks tasks = new Tasks();

        System.out.print("Enter the number of tasks: ");
        int numTasks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTasks; i++) {
            System.out.println("\nEnter details of Task " + (i + 1) + ":");
            Task task = createTask(scanner);
            tasks.addTask(task);
        }

        System.out.println("\nTask Details:");
        tasks.displayTasks();

    }

    public static Task createTask(Scanner scanner) {
        System.out.print("Task ID: ");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Task Name: ");
        String taskName = scanner.nextLine();

        System.out.print("Assigned To: ");
        String assignedTo = scanner.nextLine();

        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        System.out.print("Priority: ");
        String priority = scanner.nextLine();

        System.out.print("Status: ");
        String status = scanner.nextLine();

        return new Task(taskId, taskName, assignedTo, dueDate, priority, status);
    }
}