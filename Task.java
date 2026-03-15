

public class Task {
    public String title;
    private boolean isDone;


    public Task(String title) 
    {
        this.title = title;
        this.isDone = false;
    }


    public void markDone()
    {
        isDone = true;
    }

    public boolean isDone()
    {
        return isDone;
    }

    public String getTitle ()
    {
        return title;
    }

    @Override
    public String toString()
    {
        return (isDone ? "[x]" : "[ ]") + title;
    }
    
}
