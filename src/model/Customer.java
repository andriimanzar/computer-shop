package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {

  private String firstName;
  private String lastName;
  private String email;
  private BigDecimal balance;
  private List<Order> orderList;

  public Customer(String firstName, String lastName, String email, BigDecimal balance) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.balance = balance;
    orderList = new ArrayList<>();
  }

  public String getEmail() {
    return email;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public List<Order> getOrderList() {
    return orderList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(email, customer.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    return "Customer{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
        + ", email='" + email + '\'' + ", balance=" + balance + '}';
  }
}
