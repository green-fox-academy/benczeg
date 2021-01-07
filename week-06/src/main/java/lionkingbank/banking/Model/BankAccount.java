package lionkingbank.banking.Model;

public class BankAccount {

  String name;
  Integer balance;
  String animalType;
  Boolean isKing;
  Boolean isBad = false;

  public BankAccount(String name, Integer balance, String animalType, Boolean isKing,
                     Boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public Boolean getBad() {
    return isBad;
  }

  public Boolean getKing() {
    return isKing;
  }

  public BankAccount(String name, Integer balance, String animalType, Boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public BankAccount(String name, Integer balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
  }

  public void setKing(Boolean king) {
    isKing = king;
  }

  public void setBad(Boolean bad) {
    isBad = bad;
  }
}
