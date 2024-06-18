
import java.util.List;
import java.util.Scanner;
public class Task 
{

    static String printTaskDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String TaskName;
    private int TaskNumber;
    private String TaskDescription;
    private String DeveloperDetails;
    private int TaskDuration;
    private String TaskID;
    private String TaskStatus;
    private static int TotalHours = 0;
    private static int TaskCounter = 0;

    public Task(String Taskname, String TaskDescription, String DeveloperDetails, int TaskDuration, String TaskStatus) {
        this.TaskName = TaskName;
        this.TaskNumber = TaskCounter++;
        this.TaskDescription = TaskDescription;
        this.DeveloperDetails = DeveloperDetails;
        this.TaskDuration = TaskDuration;
        this.TaskStatus = TaskStatus;
        this.TaskID = createTaskID();
        TotalHours += TaskDuration;

    }

    Task(String Description, String ID, int Duration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean CheckTaskDescription() {
        return TaskDescription.length() <= 50;

    }

    public String createTaskID() {
        String TaskNamePart = TaskName.length() >= 2
                ? TaskName.substring(0, 2).toUpperCase() : TaskName.toUpperCase();
        String DeveloperNamePart = DeveloperDetails.length() >= 3
                ? DeveloperDetails.substring(DeveloperDetails.length() - 3).toUpperCase() : DeveloperDetails.toUpperCase();
        return TaskNamePart + ":" + TaskNumber + ":" + DeveloperNamePart;

    }
   
    public String PrintTaskDetails() {
        return "Task Name: " + TaskName + "\n" + "Task Number: " + TaskNumber + "\n" + "Task Description: " + TaskDescription + "\n" + "Developer Details: " + DeveloperDetails + "\n" + "Task Duration :" + TaskDuration + " hours\n" + "Task ID: " + TaskID + "\n" + "Task Status: " + TaskStatus;

    }
    
    public int getTaskDuration()
    {
    return TaskDuration;
    }

    public static int returnTotalHours(List<Task> tasks)
    {
      int TotalHours = 0;
      for (Task task : tasks)
      {
      TotalHours += task.getTaskDuration();
      }
       
        return TotalHours;
    }
    
    static boolean checkTaskDescription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}