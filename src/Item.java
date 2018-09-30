 import java.util.Date;

  public interface Item {
    public final String	MANUFARCTURE = "OracleProduction";
    final String manufacturer = "OracleProduction";
    void setProductionNumber(int productionNumber);
    void setName(String name);
    String getName();
    Date getManufactureDate();
    int getSerialNumber();

  }


