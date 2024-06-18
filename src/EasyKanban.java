import java.util.ArrayList;
import java.util.Scanner;
public class EasyKanban 
{
    private static ArrayList<Task> Tasks = new ArrayList<>();
    private static Scanner malux = new Scanner(System.in);

    public static void main(String[] args) 
    {
       TaskManager taskManager = new TaskManager();
       taskManager.PopulateData();
        
      System.out.println("Task with status 'Done':");
      
      taskManager.DisplayTaskWithStatusDone();
      
      System.out.println();
      
      System.out.println("Task with the longest duration: ");
      
      taskManager.DisplayTaskWithLongestDuration();
      
      System.out.println();
      
      System.out.println("Search for task 'Create Login':");
      
      taskManager.SearchTaskByName("Create Login");
      
      System.out.println();
      
      System.out.println("Tasks assigned to developer 'Samantha Paulson':");
      
      taskManager.SearchTaskByseveloper("Samantha Paulson");
      
      System.out.println();
      
      System.out.println("Deleting task 'Create Reports':");
      
      taskManager.DeleteTaskByName("Create Reports");
      
      System.out.println();
      
      System.out.println("Displaying all tasks:");
     
      taskManager.DisplayAllTasks();
      
       



       String login;
       if (login()) {
            System.out.print("Welcome to EasyKanban");
            login = malux.next();

            int numberTasks = getNumberOfTasks();
            while (true) {
                showMenu();
                int choice = malux.nextInt();

                malux.nextLine();

                switch (choice) {
                    case 1:
                        addTasks(numberTasks);
                        break;
                    case 2:
                        showReport();
                        break;
                    case 3:
                        System.out.print("Exiting the application.  Goodbye!");
                        return;
                    default:
                        System.out.print("Invalid choice, please try again");
                }
            }

        } else {
            System.out.print("Login failed. Exiting the application");
        }

    }

    private static boolean login() {
        System.out.print("Please log in");

        System.out.print("Username: ");
        String username;
        username = malux.nextLine();

        System.out.print("Password: ");
        String password;
        password = malux.nextLine();

        return "admin".equals(username) && "password".equals(password);

    }

    private static void showMenu() {
        System.out.print("Menu:");
        System.out.print("1) Add Task");
        System.out.print("2) Show Report");
        System.out.print("3) Quit");
        System.out.print("Enter your choice: ");

    }

    private static void addTasks(int numberTasks) {
        for (int m = 0; m < numberTasks; m++) {
            System.out.print("Enter the task name: ");
            String TaskName;
            TaskName = malux.nextLine();

            System.out.print("Enter the task description: ");
            String TaskDescription;
            TaskDescription = malux.nextLine();

            System.out.print("Enter developers name and surname: ");
            String DeveloperDetails;
            DeveloperDetails = malux.nextLine();

            System.out.print("Enter the task duration in hours: ");
            int TaskDuration;
            TaskDuration = malux.nextInt();

            malux.nextLine();

            System.out.print("Select task status:");
            System.out.print("1) To Do");
            System.out.print("2) Done");
            System.out.print("3) Doing");
            System.out.print("Enter your choice: ");

            int StatusChoice;
            StatusChoice = malux.nextInt();
            malux.nextLine();

            String TaskStatus = "";
            switch (StatusChoice) {
                case 1:
                    TaskStatus = "To do";
                    break;
                case 2:
                    TaskStatus = "Done";
                    break;
                case 3:
                    TaskStatus = "Doing";
                    break;
                default:
                    System.out.print("To Do");
            }

            Task task = new Task(TaskName, TaskDescription, DeveloperDetails, TaskDuration, TaskStatus);

            if (Task.checkTaskDescription()) {
                Tasks.add(task);
                System.out.print("Task successfully captured: \n" + Task.printTaskDetails());

            } else {
                System.out.print("Please eneter a task description of less than 50 characters");
            }

        }

    }

    public static void showReport() {
        System.out.print("Coming soon");

    }

    private static int getNumberOfTasks() {
        System.out.print("How many tasks do you wish to enter? ");
        return malux.nextInt();
    }
    

}
