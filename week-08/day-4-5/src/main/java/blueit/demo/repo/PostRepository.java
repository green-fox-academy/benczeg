package blueit.demo.repo;

import blueit.demo.model.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
  Boolean existsByTitle(String title);
  long count();

  @Query(value = "SELECT * FROM Post Order by upvote desc Limit 5 offset :page", nativeQuery = true)
  public List<Post> getPostListByPage(int page);
}
