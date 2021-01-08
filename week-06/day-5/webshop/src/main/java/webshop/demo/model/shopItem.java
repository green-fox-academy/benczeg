package webshop.demo.model;

public class shopItem {

  String name;
  String description;
  Integer priceInCrown;
  Integer quantityOfStock;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPriceInCrown() {
    return priceInCrown;
  }

  public void setPriceInCrown(Integer priceInCrown) {
    this.priceInCrown = priceInCrown;
  }

  public Integer getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(Integer quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public shopItem(String name, String description, Integer priceInCrown,
                  Integer quantityOfStock) {
    this.name = name;
    this.description = description;
    this.priceInCrown = priceInCrown;
    this.quantityOfStock = quantityOfStock;
  }
}
