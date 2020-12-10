public class ToDoService {

  private static ToDo todo = new ToDo();

  public void handleArgument(String[] arguments) {
    if (arguments.length == 0) {
      todo.emptyArgument();
    } else {
      switch (arguments[0]) {
        case "-l": {
          todo.lists();
          break;
        }
        case "-a": {
          todo.adds(arguments[1]);
          break;
        }
        case "-c": {
          todo.completes();
          break;
        }
        case "-r": {
          todo.removes(arguments[1]);
          break;
        }
        default: {
          System.out.println("invalid arguments");
          break;
        }
      }
    }
  }
}
