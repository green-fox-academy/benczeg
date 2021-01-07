package lionkingbank.banking.Model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

  List<BankAccount> accountList = new ArrayList<>();

  public void addToAccountList(BankAccount account) {
    this.accountList.add(account);
  }

  public List<BankAccount> showAccounts(){
    return accountList;
  }
}
