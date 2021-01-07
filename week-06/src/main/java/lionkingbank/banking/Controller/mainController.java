package lionkingbank.banking.Controller;

import java.util.List;
import lionkingbank.banking.Model.Bank;
import lionkingbank.banking.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

  Bank bank = new Bank();

  public mainController() {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    bank.addToAccountList(bankAccount);
    bank.addToAccountList(new BankAccount("Scar", 1000, "lion"));
    bank.addToAccountList(new BankAccount("Timon", 2000, "meerkat"));
    bank.addToAccountList(new BankAccount("Pumba", 3000, "warthog"));
    bank.addToAccountList(new BankAccount("Brrr", 4000, "snake"));
    bank.addToAccountList(new BankAccount("Br", 5000, "giraffe"));
    bank.addToAccountList(new BankAccount("Mufasa", 5000, "lion", true, true));

  }

  @GetMapping("/show")
  public String show(Model model) {
    model.addAttribute("accountList", bank.showAccounts());
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "bank-account";
  }

  @GetMapping("ception")
  public String ception() {
    return "htmlception";
  }

  @GetMapping("list")
  public String list(Model model) {
    model.addAttribute("accountList", bank.showAccounts());
    return "bank-account";
  }

  @PostMapping("/save")
  public String addAccount(@RequestParam String name, Integer balance, String animalType,
                           String isKing, String isBad) {
    BankAccount bankAccount = new BankAccount(name, balance, animalType);
    bankAccount.setKing(isKing != null);
    bankAccount.setBad(isBad != null);
    bank.addToAccountList(bankAccount);
    return "redirect:/list";
  }

  @GetMapping("/add-money")
  public String addMoney() {
    for (BankAccount account : bank.showAccounts()) {
      if (account.getKing()) {
        account.setBalance(account.getBalance() + 100);
      } else {
        account.setBalance(account.getBalance() + 10);
      }
    }
    return "redirect:/list";
  }
}
