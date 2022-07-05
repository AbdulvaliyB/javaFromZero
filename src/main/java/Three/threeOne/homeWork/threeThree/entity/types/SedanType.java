package Three.threeOne.homeWork.threeThree.entity.types;

import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByBodyTypes;
import Three.threeOne.homeWork.threeThree.enums.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
