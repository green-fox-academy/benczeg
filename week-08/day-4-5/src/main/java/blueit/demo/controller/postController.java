package blueit.demo.controller;

import blueit.demo.service.PostService;
import blueit.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class postController {
  private PostService postService;
  private UserService userService;

  @Autowired
  public postController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String startPage(Model model) {
    if (userService.currentUserOrLogin()) {
      model.addAttribute("postList", postService.getStartingPage());
      model.addAttribute("pageList", postService.getPages());
      return "index";
    } else {
      return "/login";
    }
  }

  @GetMapping("index/{page}")
  public String goToPage(@PathVariable Integer page, Model model) {
    if (page == null) {
      return "redirect:/";
    } else {
      model.addAttribute("postList", postService.getGivenPage(page));
      model.addAttribute("pageList", postService.getPages());
      return "index";
    }
  }

  @PostMapping("/registration")
  public String register(@RequestParam String userName, String password, Model model) {
    model.addAttribute("registText", userService.register(userName, password));
    return "feedback";
  }

  @GetMapping("/registration")
  public String registerStart() {
    return "registration";
  }

  @GetMapping("/login")
  public String loginStart() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam String userName, String password, Model model) {
    model.addAttribute("registText", userService.login(userName, password));
    return "feedback";
  }

  @GetMapping("/submit")
  public String submitStart() {
    return "submit";
  }

  @PostMapping("submit")
  public String submit(@RequestParam String title, String content, Model model) {
    model.addAttribute("registText", postService.newPostAdder(title, content,userService.getCurrentID()));
    return "feedback";
  }

  @GetMapping("post/{id}")
  public String readPost(@PathVariable Long id, Model model) {
    model.addAttribute("post", postService.findPostById(id));
    return "content";
  }

  @GetMapping("/upvote/{id}")
  public String upvote(@PathVariable Long id, Model model) {
    model.addAttribute("registText", postService.upVote(id));
    return "feedback";
  }

  @GetMapping("/downvote/{id}")
  public String downvote(@PathVariable Long id, Model model) {
    model.addAttribute("registText", postService.downVote(id));
    return "feedback";
  }
}
