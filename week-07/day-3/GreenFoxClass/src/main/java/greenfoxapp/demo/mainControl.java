package greenfoxapp.demo;

import greenfoxapp.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainControl {

  @Autowired
  StudentService studentService;

  @GetMapping("gfa/list")
  public String list(Model model){
    model.addAttribute("list", studentService.findAll());
    return "list";
  }

  @GetMapping("gfa/add")
  public String add(){
    return "add";
  }

  @PostMapping("gfa/save")
  public String save(@RequestParam String name){
    studentService.save(name);
    return "redirect:/gfa";
  }

  @GetMapping("gfa")
  public String gfa(){
    return "index";
  }

  @GetMapping("/gfa/count")
  public String count(Model model){
    model.addAttribute("count", studentService.count());
    return "count";
  }

  @GetMapping("gfa/check")
  public String check(){
    return "check";
  }

  @PostMapping("gfa/check")
  public String checked(@RequestParam String name,Model model){
    model.addAttribute("result", studentService.findStudent(name));
    return "check";
  }
}
