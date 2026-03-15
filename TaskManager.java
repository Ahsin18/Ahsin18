import java.util.ArrayList;
public class TaskManager
{
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description)
    {
        tasks.add(new Task(description));
        System.out.println("\nTask added: " + description);
    }

    public void viewTasks()
    {
        if (tasks.isEmpty())
        {
            System.out.println("No tasks found.");
            return;

        }
        for(int i=0; i<tasks.size();i++)
        {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }

    public void markTaskAsDone(int index)
    {
        if (index >=0 && index < tasks.size())
        {
            tasks.get(index).markDone();
            System.out.println("\nTask marked as done: " );
        }
        else
        {
            System.out.println("Invalid task number.");
        }
    }

    public void deleteTask(int index)
    {
        if (index >=0 && index < tasks.size())
        {
            tasks.remove(index);
            System.out.println("\nTask deleted.");

        }else
        {
            System.out.println("Invalid task number.");
        }
    }
}