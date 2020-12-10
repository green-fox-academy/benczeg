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
    tasksList.add("[ ]" + string);
    makeTasksList(tasksList);
  }

  public void removes(String taskNumber) {
    int taskNumberToRemove = 9999;
    try {
      taskNumberToRemove = Integer.parseInt(taskNumber) - 1;
    } catch (Exception e) {
      System.out.println("Unable to remove: index is not a number");
    }
    List<String> tasksList = getTasksList();
    if (taskNumberToRemove < tasksList.size()) {
      tasksList.remove(taskNumberToRemove);
      makeTasksList(tasksList);
    } else {
      System.out.println("Unable to remove: index is out of bound");
    }
  }

  public void completes(String taskNumber) {
    int taskNumberToRemove = 9999;
    try {
      taskNumberToRemove = Integer.parseInt(taskNumber) - 1;
    } catch (Exception e) {
      System.out.println("Unable to remove: index is not a number");
    }
    List<String> tasksList = getTasksList();
    if (taskNumberToRemove < tasksList.size()) {
      String[] redo = new String[2];
      redo = tasksList.get(taskNumberToRemove).split("[ ]");
      tasksList.add(taskNumberToRemove,redo[0]);
      makeTasksList(tasksList);
    } else {
      System.out.println("Unable to remove: index is out of bound");
    }
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
