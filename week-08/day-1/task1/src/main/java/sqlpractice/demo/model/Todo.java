package sqlpractice.demo.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String title;
  Boolean urgent = false;
  Boolean done = false;
  Long assignee_id;

  public Todo(String title) {
    this.title = title;
  }

  public Todo(String title, Boolean urgent, Boolean done) {
    this.title = title;
    this.urgent = urgent != null;
    this.done = Objects.requireNonNullElse(done, false);
  }

  public Todo(Long id, String title, Boolean urgent, Boolean done) {
     //
  }
}
