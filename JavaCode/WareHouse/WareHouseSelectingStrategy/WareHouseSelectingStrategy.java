package WareHouse.WareHouseSelectingStrategy;

import WareHouse.WareHouse;
import java.util.*;

public abstract class WareHouseSelectingStrategy {

    public abstract WareHouse getWareHouse(List<WareHouse> wareHouseList);

}
