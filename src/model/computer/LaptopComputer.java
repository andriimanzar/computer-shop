package model.computer;

import java.math.BigDecimal;
import model.computer.property.hardware.Battery;
import model.computer.property.hardware.CPU;
import model.computer.property.hardware.GPU;
import model.computer.property.hardware.MemoryDisk;
import model.computer.property.hardware.Motherboard;
import model.computer.property.hardware.RAM;
import model.computer.property.hardware.WifiCard;
import model.computer.property.software.OperatingSystem;

public class LaptopComputer extends PersonalComputer {

  private Battery battery;
  private GPU gpu;
  private WifiCard wifiCard;

  public LaptopComputer(String model, Motherboard motherboard, CPU cpu, RAM ram,
      MemoryDisk memoryDisk, GPU gpu, Battery battery, WifiCard wifiCard,
      OperatingSystem operatingSystem, BigDecimal price) {
    super(model, motherboard, cpu, ram, memoryDisk, operatingSystem, price);
    this.battery = battery;
    this.gpu = gpu;
    this.wifiCard = wifiCard;
  }

  @Override
  public String toString() {
    return super.toString() + "LaptopComputer{" +
        "battery=" + battery +
        ", gpu=" + gpu +
        ", wifiCard=" + wifiCard +
        '}';
  }
}
