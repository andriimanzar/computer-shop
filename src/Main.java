import factory.ComputerFactory;
import java.math.BigDecimal;
import model.Customer;
import model.Stock;
import model.computer.PersonalComputer;
import service.PurchaseService;

public class Main {

  public static void main(String[] args) {

    PersonalComputer desktopComputer = ComputerFactory.createDesktopComputer();
    PersonalComputer laptopComputer = ComputerFactory.createLaptopComputer();
    PersonalComputer tabletComputer = ComputerFactory.createTabletComputer();

    Stock stock = new Stock();
    stock.addComputer(desktopComputer, 10);
    stock.addComputer(laptopComputer, 5);
    stock.addComputer(tabletComputer, 5);

    Customer customer = new Customer("Test", "Customer", "test_customer@gmail.com",
        BigDecimal.valueOf(5000));

    PurchaseService purchaseService = new PurchaseService(stock);

    purchaseService.purchase(customer, desktopComputer);
    purchaseService.purchase(customer, laptopComputer);
    purchaseService.purchase(customer, tabletComputer);

    System.out.println(customer); // customer balance must change
    customer.getOrderList().forEach(System.out::println); // customer should have 3 orders
    System.out.println(
        stock.getAvailableComputers().get(
            desktopComputer)); // amount of computers must be one less(before purchase - 10, after - 9)
  }
}