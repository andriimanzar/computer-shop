package model.computer;

import java.math.BigDecimal;
import model.computer.property.hardware.CPU;
import model.computer.property.hardware.ExternalMonitor;
import model.computer.property.hardware.GPU;
import model.computer.property.hardware.MemoryDisk;
import model.computer.property.hardware.Motherboard;
import model.computer.property.hardware.RAM;
import model.computer.property.software.OperatingSystem;

public class DesktopComputer extends PersonalComputer {

  private ExternalMonitor externalMonitor;
  private GPU gpu;

  public DesktopComputer(String model, Motherboard motherboard, CPU cpu, RAM ram,
      MemoryDisk memoryDisk,
      ExternalMonitor externalMonitor, GPU gpu, OperatingSystem operatingSystem, BigDecimal price) {
    super(model, motherboard, cpu, ram, memoryDisk, operatingSystem, price);
    this.externalMonitor = externalMonitor;
    this.gpu = gpu;
  }

  @Override
  public String toString() {
    return super.toString() + "DesktopComputer{" +
        "externalMonitor=" + externalMonitor +
        ", gpu=" + gpu +
        '}';
  }
}
