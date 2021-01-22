package sqlpractice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sqlpractice.demo.model.Assignee;
import sqlpractice.demo.model.Todo;
import sqlpractice.demo.repository.AssigneeRepo;
import sqlpractice.demo.repository.TodoRepository;

@Controller
public class TodoController {
  TodoRepository todoRepository;
  AssigneeRepo assigneeRepo;

  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeRepo assigneeRepo) {
    this.todoRepository = todoRepository;
    this.assigneeRepo = assigneeRepo;
  }

  @GetMapping("/todo")
  public String list() {
    return "redirect:/";
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("todolist", todoRepository.findAll());
    return "todolist";
  }

  @PostMapping("/add")
  public String add(String title, Boolean urgent, Boolean done) {
    todoRepository.save(new Todo(title, urgent, done));
    return "redirect:/";
  }

  @PostMapping("/todo?isActive=done")      //????????????????????????????????????
  public String active(@RequestParam Boolean done, Model model) {
    model.addAttribute("todolist", todoRepository.findAllByDoneIsTrue());
    return "todolist";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodobyId(@PathVariable Long id) {
    todoRepository.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editTodoById(@PathVariable Long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).orElse(null));
    return "edit";
  }

  @PostMapping("/edit")
  public String editByPost(@RequestParam Long id, String title, Boolean urgent, Boolean done,
                           Long assignee_id) {
    todoRepository.save(new Todo(id, title, urgent, done, assignee_id));
    return "redirect:/";
  }

  @PostMapping("/search")
  public String editByPost(@RequestParam String search, Model model) {
    model.addAttribute("todolist", todoRepository.findTodosByTitleContains(search));
    return "todolist";
  }

  @GetMapping("/assignees")
  public String assignees(Model model) {
    model.addAttribute("assignees", assigneeRepo.findAll());
    return "assignees";
  }

  @GetMapping("/{id}/edit-assignee")
  public String editAss(Model model, @PathVariable Long id) {
    model.addAttribute("assignee", assigneeRepo.findAssigneeById(id));
    return "edit-assignee";
  }

  @PostMapping("/assignees")
  public String assigneeEdit(@ModelAttribute Assignee assignee) {
    assigneeRepo.save(assignee);
    return "redirect:/assignees";
  }

  @GetMapping("/{id}/delete-assignee")
  public String deleteAss(@PathVariable Long id) {
    assigneeRepo.deleteById(id);
    return "redirect:/assignees";
  }

  @PostMapping("/add-assignee")
  public String addAss(String name, String email) {
    assigneeRepo.save(new Assignee(name, email));
    return "redirect:/assignees";
  }

  @PostMapping("/search-by-assignee")
  public String findAss(@RequestParam String searchName, Model model) {
    model.addAttribute("assignees", assigneeRepo.findAssigneeByName(searchName));
    return "assignees";
  }
}
