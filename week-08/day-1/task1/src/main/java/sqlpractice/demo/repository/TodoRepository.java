package sqlpractice.demo.repository;

import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sqlpractice.demo.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findAllByDoneIsFalse();
  public List<Todo> findAllByDoneIsTrue();
  public List<Todo> findTodosByTitleContains(String search);
}
