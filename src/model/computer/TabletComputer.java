package model.computer;

import java.math.BigDecimal;
import model.computer.property.hardware.Battery;
import model.computer.property.hardware.CPU;
import model.computer.property.hardware.Camera;
import model.computer.property.hardware.MemoryDisk;
import model.computer.property.hardware.Motherboard;
import model.computer.property.hardware.RAM;
import model.computer.property.hardware.WifiCard;
import model.computer.property.software.OperatingSystem;

public class TabletComputer extends PersonalComputer {

  private Battery battery;
  private WifiCard wifiCard;
  private Camera camera;

  public TabletComputer(String model, Motherboard motherboard, CPU cpu, RAM ram,
      MemoryDisk memoryDisk, Battery battery, WifiCard wifiCard, Camera camera,
      OperatingSystem operatingSystem, BigDecimal price) {
    super(model, motherboard, cpu, ram, memoryDisk, operatingSystem, price);
    this.battery = battery;
    this.wifiCard = wifiCard;
    this.camera = camera;
  }

  @Override
  public String toString() {
    return super.toString() + "TabletComputer{" +
        "battery=" + battery +
        ", wifiCard=" + wifiCard +
        ", camera=" + camera +
        '}';
  }
}
