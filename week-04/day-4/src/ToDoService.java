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
          try {
            todo.adds(arguments[1]);
          } catch (Exception e) {
            //log it
            System.out.println("Unable to add: no task provided");
          }
          break;
        }
        case "-c": {
          todo.completes(arguments[1]);
          break;
        }
        case "-r": {
          try {
            todo.removes(arguments[1]);
          } catch (Exception e) {
            System.out.println("Unable to remove: no index provided");
            //log it
          }
          break;
        }
        default: {
          System.out.println("Unsupported argument");
          todo.emptyArgument();
          break;
        }
      }
    }
  }
}
