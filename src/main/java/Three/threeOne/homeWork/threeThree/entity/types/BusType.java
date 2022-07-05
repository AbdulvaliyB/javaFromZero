package Three.threeOne.homeWork.threeThree.entity.types;

import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByBodyTypes;
import Three.threeOne.homeWork.threeThree.enums.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
