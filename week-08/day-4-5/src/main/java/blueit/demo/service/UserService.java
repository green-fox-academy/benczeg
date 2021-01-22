package blueit.demo.service;

import blueit.demo.model.User;
import blueit.demo.repo.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private User currentUser;
  UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Boolean currentUserOrLogin() {
    return (currentUser != null);
  }

  public String register(String userName, String password) {
    Optional<User> user = userRepository.findUserByUserName(userName);
    if(user.isPresent()){
      return "Already registered user name.";
    }else{
      currentUser = new User(userName,password);
      userRepository.save(currentUser);
      return "Registered as " + userName;
    }
  }

  public String login(String userName, String password){
    Optional<User> user = userRepository.findUserByUserNameAndPassword(userName, password);
    if(user.isPresent()){
      currentUser = user.get();
      return "Logged in as " + userName;
    }else{
      return "Not a correct user name or password.";
    }
  }

  public long getCurrentID(){
    return currentUser.getId();
  }
}
