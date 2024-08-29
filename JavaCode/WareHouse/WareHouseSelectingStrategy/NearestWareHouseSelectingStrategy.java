package WareHouse.WareHouseSelectingStrategy;

import WareHouse.WareHouse;
import java.util.*;


public class NearestWareHouseSelectingStrategy extends WareHouseSelectingStrategy {
    
    public WareHouse getWareHouse(List<WareHouse> wareHouseList) {
        return wareHouseList.get(0);
    }
}
