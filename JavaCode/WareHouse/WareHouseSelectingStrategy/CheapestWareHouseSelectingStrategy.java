package WareHouse.WareHouseSelectingStrategy;

import WareHouse.WareHouse;
import java.util.List;

public class CheapestWareHouseSelectingStrategy extends WareHouseSelectingStrategy {
    
    @Override
    public WareHouse getWareHouse(List<WareHouse> wareHouseList) {
        return wareHouseList.get(0);
    }

}
