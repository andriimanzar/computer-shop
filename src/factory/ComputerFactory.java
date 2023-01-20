package factory;

import java.math.BigDecimal;
import model.computer.DesktopComputer;
import model.computer.LaptopComputer;
import model.computer.PersonalComputer;
import model.computer.TabletComputer;
import model.computer.property.hardware.Battery;
import model.computer.property.hardware.CPU;
import model.computer.property.hardware.Camera;
import model.computer.property.hardware.ExternalMonitor;
import model.computer.property.hardware.GPU;
import model.computer.property.hardware.MemoryDisk;
import model.computer.property.hardware.Motherboard;
import model.computer.property.hardware.RAM;
import model.computer.property.hardware.WifiCard;
import model.computer.property.software.OperatingSystem;

public class ComputerFactory {

  public static PersonalComputer createDesktopComputer() {
    return new DesktopComputer("Lenovo Legion Tower 5i (2021)",
        new Motherboard("MSI MPG Z590 Gaming Force (s1200, Intel Z590, PCI-Ex16)",
            BigDecimal.valueOf(200)), new CPU(
        "Generation Intel Core i5-11500 Processor (6 Cores, 2.70GHz, up to 4.60GHz with Turbo Boost, 12 Threads, 12MB Cache)",
        BigDecimal.valueOf(400)), new RAM(" 64GB DDR4 SDRAM", BigDecimal.valueOf(200)),
        new MemoryDisk(" 2TB PCIe NVMe M.2 Solid State Drive and 8TB Hard Disk Drive",
            BigDecimal.valueOf(350)),
        new ExternalMonitor("Xiaomi Mi Desktop Monitor 27 75Hz", BigDecimal.valueOf(150)),
        new GPU("NVIDIA GeForce GTX 1660 Super 4 GB", BigDecimal.valueOf(400)),
        new OperatingSystem("Windows 11 Home", BigDecimal.valueOf(50)), BigDecimal.valueOf(1750));
  }

  public static PersonalComputer createLaptopComputer() {
    return new LaptopComputer("Acer Nitro 5 AN515-57-79TD Gaming Laptop",
        new Motherboard("DH5VF LA-F952P", BigDecimal.valueOf(150)),
        new CPU("Intel Core i7-11800H Octa-core (8 Core™)", BigDecimal.valueOf(400)),
        new RAM("8 GB DDR4 SDRAM", BigDecimal.valueOf(75)),
        new MemoryDisk("512GB NVMe SSD", BigDecimal.valueOf(150)),
        new GPU("NVIDIA GeForce RTX 3050 Ti (4GB dedicated GDDR6 VRAM)", BigDecimal.valueOf(350)),
        new Battery("Lithium Ion batteries included, p to 8 hours of Battery Life",
            BigDecimal.valueOf(100)), new WifiCard("Killer Wi-Fi 6", new BigDecimal(30)),
        new OperatingSystem("Windows 11 Home", BigDecimal.valueOf(50)), BigDecimal.valueOf(1255));
  }

  public static PersonalComputer createTabletComputer() {
    return new TabletComputer("SAMSUNG Galaxy Tab S6 Lite",
        new Motherboard("Exynos 9611 (10nm)", BigDecimal.valueOf(50)),
        new CPU("Octa-core (4x2.3 GHz Cortex-A73 & 4x1.7 GHz Cortex-A53)", BigDecimal.valueOf(30)),
        new RAM("4GB RAM", BigDecimal.valueOf(20)),
        new MemoryDisk("128GB + microSDXC (dedicated slot)", BigDecimal.valueOf(15)),
        new Battery("Li-Po 7040 mAh, non-removable, 15W wired", BigDecimal.valueOf(25)),
        new WifiCard("Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct", BigDecimal.valueOf(10)),
        new Camera("Main Camera :8 MP, (wide), 1/4.0\", 1.12µm, HDR, panorama, 1080p@30fps",
            BigDecimal.valueOf(25)),
        new OperatingSystem("Android 10, upgradable to Android 12L, One UI 4.1.1",
            BigDecimal.valueOf(10)), BigDecimal.valueOf(185));
  }

}
