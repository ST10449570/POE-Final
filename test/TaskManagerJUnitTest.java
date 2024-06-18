import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerJUnitTest 
{
    private TaskManager taskManager;
  
    @BeforeEach
    public void setUp() 
    {
      taskManager = TaskManager();
      taskManager.populateData();
    }
    
    @Test
    public void testDeveloperArray() {
        ArrayList<String> expectedDevelopers = new ArrayList<>();
        expectedDevelopers.add("Mike Smith");
        expectedDevelopers.add("Edward Harrison");
        expectedDevelopers.add("Samantha Paulson");
        expectedDevelopers.add("Glenda Oberholzer");
        assertEquals(expectedDevelopers, taskManager.Getdevelopers());
    }

    @Test
    public void testGetTasKWithLongestDuration() {
        String expectedDeveloper = "Glenda Oberholzer";
        int expectedDuration = 11;
        assertEquals(expectedDeveloper, taskManager.Getdevelopers().get(taskManager.GetTaskDuration().indexOf(expectedDuration)));

        assertEquals((Integer) expectedDuration, taskManager.GetTaskDuration().get(taskManager.GetTaskDuration().indexOf(expectedDuration)));

    }

    @Test
    public void testSearchTaskByName() {
        String taskName = "Create Login";
        int index = taskManager.GetTaskNames().indexOf(taskName);
        assertTrue(index != -1);
        assertEquals("Mike Smith", taskManager.Getdevelopers().get(index));
    }

    @Test
    public void testSearchTaskByDeveloper() {
        ArrayList<String> expectedTasks = new ArrayList<>();
        expectedTasks.add("Create Reports");
        ArrayList<String> developerTasks = new ArrayList();
        for (int i = 0; i < taskManager.Getdevelopers().size(); i++) {
            if (taskManager.Getdevelopers().get(i).equals("Samantha Paulson")) {
                developerTasks.add(taskManager.GetTaskNames().get(i));
            }
        }
        assertEquals(expectedTasks, developerTasks);

    }

    @Test
    public void testDeleteTaskByName() {
        taskManager.DeleteTaskByName("Create Reports");

        assertFalse(taskManager.GetTaskNames().contains("Create Reports"));

    }

    @Test
    public void TestDisplayAllTasks() {
        int taskCount = taskManager.GetTaskNames().size();
        assertEquals(taskCount, taskManager.Getdevelopers().size());
        assertEquals(taskCount, taskManager.GetTaskIDs().size());
        assertEquals(taskCount, taskManager.GetTaskDuration().size());
        assertEquals(taskCount, taskManager.GetTaskStatus().size());
    }

    private TaskManager TaskManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
