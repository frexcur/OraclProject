package com.company;

import java.util.Date;

public interface Item {

  String manufacturer = "OraclProdction";

  void setProductionNumber(int newValue);

  void setName(String name);

  String getName(String name);

  Date getManufactureDate(Date manuDate);

  int getSerialNumber(int num);
  }
}
