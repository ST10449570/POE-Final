import java.util.ArrayList;
import java.util.List;
public class TaskManager
{
   private ArrayList<String> developers = new ArrayList<>() ;
   private ArrayList<String> taskNames = new ArrayList<>();
   private ArrayList<String> taskIDs = new ArrayList<>();
   private ArrayList<Integer> taskDurations  = new ArrayList<>();
   private ArrayList<String>taskStatuses = new ArrayList<>();


   private List<Task> tasks = new ArrayList<>(); 
   
   public String AddTask(String Description, String ID, int Duration)
   {
   
       if(Description.length() > 50)
       {
       return "Please enter a task Description of less than 50 characters";
       }
       tasks.add(new Task(Description, ID, Duration));
   
   return"Task successfully captured";
   }
    
    public String getTaskID(int index)
    {
    Task task = tasks.get(index);
    return task.getID();
    }
    
    public int calculateTotalHours()
    {
    int total = 0;
    for (Task task  : tasks)
    {
    total += task.getDuration();
    }
    return total;
    
    }

    void populateData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public static class Task 
    {
    private String description;
    private String ID;
    private int duration;
    private Object developers;
       
  
    public Task(String description, String ID, int Duration)
    {
    this.description = description;
    this.ID = ID;
    this.duration = Duration;
    }
    
    public String getDescription()
    {
    return description;
    }
    
    public int getDuration()
    {
    return duration;
    }

        private String getID() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }
    public void PopulateData()
    {
     addTask("Mike Smith", "Create Login", "T1", 5, "To Do");
     addTask("Edward Harrison", "Create Add Features", "T2", 8, "Doing");
     addTask("Samantha Paulson", "Create Reports", "T3", 2, "Done");
     addTask("Glenda Oberholzer", "Add Arrays", "T4", 11, "To Do");
    }

      public void addTask(String developer, String taskName, String taskID, int duration, String status)  
      {
      developers.add(developer);
      taskNames.add(taskName);
      taskIDs.add(taskID);
      taskDurations.add(duration);
      taskStatuses.add(status);
      }
    
    public void DisplayTaskWithStatusDone()
    {
     for (int i = 0; i <taskStatuses.size(); i++)
     {
      if(taskStatuses.get(i).equalsIgnoreCase("Done"))
      {
      System.out.println("Developer: " + developers.get(i) + ", Task Name: " + taskNames.get(i) + ", Task Duration: " + taskDurations.get(i));
      }
     }
    } 
     
     public void  DisplayTaskWithLongestDuration()
     {
       int maxDurationIndex = 0;
       for (int i = 1; i <taskDurations.size(); i++)
       {
       if(taskDurations.get(i) > taskDurations.get(maxDurationIndex))
       {
       maxDurationIndex = i;
       }
       }
      System.out.println("Developer: " + developers.get(maxDurationIndex) + ", Duration: " + taskDurations.get(maxDurationIndex));
     }
    
     public void SearchTaskByName(String taskName)
     {
         int index = taskNames.indexOf(taskName);
         if(index != -1)
         {
             System.out.println("task Name: " + taskNames.get(index) + ", Developer: " + developers.get(index) + ", Task Status: " + taskStatuses.get(index));
         }else
         {
             System.out.println("Task not found");
         }
     }
    
     public void SearchTaskByseveloper(String developerName)
     {
         for (int i = 0; i <developers.size(); i++)
         {
           if(developers.get(i).equalsIgnoreCase(developerName))
            {
              System.out.println("Task Name: " + taskNames.get(i) + ",Task Status: " + taskStatuses.get(i));
            }
         }
        
     }
     public void DeleteTaskByName(String taskName)
     {
      int index = taskNames.indexOf(taskName);
      if (index!= -1)
      {
          developers.remove(index);
          taskNames.remove(index);
          taskIDs.remove(index);
          taskDurations.remove(index);
          taskStatuses.remove(index);
          System.out.println("Task '" + taskName + "' successfully deleted");
      }else
      {
          System.out.println("Task not found");
      }
     
     }
     
     public void DisplayAllTasks()
     {
         for (int i = 0; i <taskNames.size(); i++)
         {
             System.out.println("Developer: "+ developers.get(i) + ", Task Name: " + taskNames.get(i) + ", Task ID: " + taskIDs.get(i) + ", Duration: " + taskDurations.get(i) + ", Status: " + taskStatuses.get(i));
     
         }
     }
     
     public ArrayList<String> Getdevelopers()
     {
         return developers;
     }
     
     public ArrayList<String> GetTaskNames()
     {
         return taskNames;
     }
     
     public ArrayList<String> GetTaskIDs() 
     {
        return taskIDs;
    }
     
     public ArrayList<Integer> GetTaskDuration() 
     {
        return taskDurations;
    }
     
     public ArrayList<String> GetTaskStatus() 
     {
        return taskStatuses;
    }
     

     private String getID() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
     
    } 
    
 
   
    
    
   
    
    
    
    
    
    

