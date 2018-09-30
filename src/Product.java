import java.util.Date;

public abstract class Product implements Item{
  int serialNumber;
  Date manufacturedOn;
  String name;
  static Integer currentProductionNumber = 1;

  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date(System.currentTimeMillis());
  }

  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + manufacturedOn + "\n" +
        "Name : " + name + "\n";
  }

  @Override
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }
}
