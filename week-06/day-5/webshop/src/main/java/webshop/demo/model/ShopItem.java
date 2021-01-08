package webshop.demo.model;

public class ShopItem {

  String name;
  String description;
  Integer price;
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

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Integer getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(Integer quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public ShopItem(String name, String description, Integer priceInCrown,
                  Integer quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = priceInCrown;
    this.quantityOfStock = quantityOfStock;
  }
}
