package model;

import exception.InvalidAmountException;
import java.util.HashMap;
import java.util.Map;
import model.computer.PersonalComputer;

public class Stock {

  private final Map<PersonalComputer, Integer> availableComputers;

  public Stock() {
    availableComputers = new HashMap<>();
  }

  public boolean isAvailableInStock(PersonalComputer personalComputer) {
    return availableComputers.get(personalComputer) > 0;
  }

  public void addComputer(PersonalComputer personalComputer, int amount) {
    if (amount <= 0) {
      throw new InvalidAmountException("Invalid amount for adding to stock");
    }
    availableComputers.compute(personalComputer,
        (computer, currentAmount) -> currentAmount == null ? amount : currentAmount + amount);
  }

  public void removeOneComputer(PersonalComputer personalComputer) {
    availableComputers.computeIfPresent(personalComputer,
        (computer, currentAmount) -> currentAmount - 1);
  }

  public Map<PersonalComputer, Integer> getAvailableComputers() {
    return availableComputers;
  }
}
