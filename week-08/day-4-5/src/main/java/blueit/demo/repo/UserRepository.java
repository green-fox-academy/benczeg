package blueit.demo.repo;

import blueit.demo.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findUserByUserNameAndPassword(String Username, String Password);
  Optional<User> findUserByUserName(String Username);
}
