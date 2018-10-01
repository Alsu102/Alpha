//importing the udate package - get a date
import java.util.Date;

//creates interface Item
  public interface Item {
    //constant Value
    public final String	MANUFARCTURE = "OracleProduction";

    final String manufacturer = "OracleProduction";
    void setProductionNumber(int productionNumber);
    void setName(String name);
    String getName();
    Date getManufactureDate();
    int getSerialNumber();

  }


