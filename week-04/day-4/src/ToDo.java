import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ToDo {

  public void emptyArgument() {
    Path pathInstructions = Paths.get("resources/Instructions.txt");
    List<String> instructionsList = new ArrayList<>();
    try {
      instructionsList.addAll(Files.readAllLines(pathInstructions));
    } catch (IOException e) {
      System.out.println("Can't find any Instructions.");
    }
    for (String line : instructionsList) {
      System.out.println(line);
    }
  }

  public void lists() {
    List<String> tasksList = getTasksList();
    int listItemNumber = 1;
    if (tasksList.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      for (String line : tasksList) {
        System.out.println(listItemNumber + " - " + line);
      }
    }
  }


  public void adds(String string) {
    List<String> tasksList = getTasksList();
    tasksList.add(string);
    makeTasksList(tasksList);
  }

  public void removes(String taskNumber) {
    int taskNumberToRemove = Integer.parseInt(taskNumber) - 1;
    List<String> tasksList = getTasksList();
    tasksList.remove(taskNumberToRemove);
    makeTasksList(tasksList);
  }

  public void completes() {

  }

  private List<String> getTasksList() {
    Path pathTasks = Paths.get("resources/tasks.txt");
    List<String> tasksList = new ArrayList<>();
    try {
      tasksList.addAll(Files.readAllLines(pathTasks));
    } catch (IOException e) {
      System.out.println("Can't reach any task holding file.");
    }
    return tasksList;
  }

  private void makeTasksList(List<String> lines) {
    Path pathTasks = Paths.get("resources/tasks.txt");
    try {
      Files.write(pathTasks, lines);
    } catch (IOException e) {
      System.out.println("Can't create file.");
    }

  }
}
