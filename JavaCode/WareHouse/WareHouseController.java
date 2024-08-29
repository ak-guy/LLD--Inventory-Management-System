package WareHouse;

import java.util.*;

import WareHouse.WareHouseSelectingStrategy.WareHouseSelectingStrategy;

public class WareHouseController {
    List<WareHouse> wareHouseList;
    WareHouseSelectingStrategy selectionStrategy;

    public WareHouseController(List<WareHouse> wareHouseList, WareHouseSelectingStrategy selectionStrategy) {
        this.wareHouseList = wareHouseList;
        this.selectionStrategy = selectionStrategy;
    }

    public void addWareHouse(WareHouse wareHouse) {
        wareHouseList.add(wareHouse);
    }

    public void removeWareHouse(WareHouse wareHouse) {
        wareHouseList.remove(wareHouse);
    }

    public WareHouse getWareHouse(WareHouseSelectingStrategy wareHouseSelectingStrategy) {
        this.selectionStrategy = wareHouseSelectingStrategy;
        return selectionStrategy.getWareHouse(wareHouseList);
    }
}
