package service;

import exception.NotAvailableToPurchaseException;
import exception.NotEnoughMoneyException;
import java.math.BigDecimal;
import java.time.LocalDate;
import model.Stock;
import model.Customer;
import model.Order;
import model.computer.PersonalComputer;

public class PurchaseService {

  private final Stock stock;

  public PurchaseService(Stock stock) {
    this.stock = stock;
  }

  public void purchase(Customer customer, PersonalComputer personalComputer) {
    if (customer.getBalance().compareTo(personalComputer.getPrice()) < 0) {
      throw new NotEnoughMoneyException("Customer has not enough money to buy this computer!");
    } else if (!stock.isAvailableInStock(personalComputer)) {
      throw new NotAvailableToPurchaseException(
          "This personal computer is not present in stock at this moment");
    }

    BigDecimal customerBalanceAfterPurchase = customer.getBalance()
        .subtract(personalComputer.getPrice());
    customer.setBalance(customerBalanceAfterPurchase);

    Order order = new Order(customer.getEmail(), personalComputer.getModel(), LocalDate.now(),
        personalComputer.getPrice());
    customer.getOrderList().add(order);

    stock.removeOneComputer(personalComputer);
  }

}
