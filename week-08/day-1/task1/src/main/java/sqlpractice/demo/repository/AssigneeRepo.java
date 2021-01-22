package sqlpractice.demo.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sqlpractice.demo.model.Assignee;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
  public Assignee findAssigneeById(Long id);
  public List<Assignee> findAssigneeByName(String name);
}
