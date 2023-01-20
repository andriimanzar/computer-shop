package model.computer.property;

import java.math.BigDecimal;

public abstract class Property {

  private final String description;
  private final BigDecimal price;

  public Property(String description, BigDecimal price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
