import java.util.Scanner;

public class Todolistaap
{
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true)
         {
            System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Welcome to the To-Do List Application!");
            System.out.println("Please choose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = sc.nextLine(); // full line input
                    taskManager.addTask(description);
                    break;

                case 2:
                    System.out.println("Your tasks are:");
                    taskManager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task number to mark as done: ");
                    int doneIndex = sc.nextInt() - 1;
                    taskManager.markTaskAsDone(doneIndex);
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = sc.nextInt() - 1;
                    taskManager.deleteTask(deleteIndex);
                    break;

                case 5:
                    System.out.println("Exiting... Byeee!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
