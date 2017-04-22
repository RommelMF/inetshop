package shop.models;

import java.util.Map;

/**
 * Created by Home on 21.04.2017.
 */
public interface Product {

     long getId();
     void setId(long id);

     String getName();
     void setName(String name);

     String getTitle();
     void setTitle(String title);

     double getCost();
     void setCost(double cost);

     long getQuantity();
     void setQuantity(long quantity);

     Map<String, String> getMapCharacters();
     void setMapCharacters(Map<String, String> map);

}
