public class Main {
  private static ToDoService toDoService = new ToDoService();

  public static void main(String[] args) {
    toDoService.handleArgument(args);
  }
}
