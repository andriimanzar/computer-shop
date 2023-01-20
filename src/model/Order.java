package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {

  private String customerEmail;
  private String computerModel;
  private LocalDate purchaseDate;
  private BigDecimal total;

  public Order(String customerEmail, String computerModel, LocalDate purchaseDate,
      BigDecimal total) {
    this.customerEmail = customerEmail;
    this.computerModel = computerModel;
    this.purchaseDate = purchaseDate;
    this.total = total;
  }

  @Override
  public String toString() {
    return "Order{" +
        "customerEmail='" + customerEmail + '\'' +
        ", computerModel='" + computerModel + '\'' +
        ", purchaseDate=" + purchaseDate +
        ", total=" + total +
        '}';
  }
}
