package model.computer;

import java.math.BigDecimal;
import java.util.Objects;
import model.computer.property.hardware.CPU;
import model.computer.property.hardware.MemoryDisk;
import model.computer.property.hardware.Motherboard;
import model.computer.property.hardware.RAM;
import model.computer.property.software.OperatingSystem;

public abstract class PersonalComputer {

  private String model;
  private Motherboard motherboard;
  private CPU cpu;
  private RAM ram;
  private MemoryDisk memoryDisk;
  private OperatingSystem operatingSystem;
  private BigDecimal price;

  public PersonalComputer(String model, Motherboard motherboard, CPU cpu, RAM ram,
      MemoryDisk memoryDisk, OperatingSystem operatingSystem, BigDecimal price) {
    this.model = model;
    this.motherboard = motherboard;
    this.cpu = cpu;
    this.ram = ram;
    this.memoryDisk = memoryDisk;
    this.operatingSystem = operatingSystem;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalComputer that = (PersonalComputer) o;
    return Objects.equals(model, that.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    return "PersonalComputer{" +
        "model='" + model + '\'' +
        ", motherboard=" + motherboard +
        ", cpu=" + cpu +
        ", ram=" + ram +
        ", memoryDisk=" + memoryDisk +
        ", operatingSystem=" + operatingSystem +
        ", price=" + price +
        '}';
  }
}
