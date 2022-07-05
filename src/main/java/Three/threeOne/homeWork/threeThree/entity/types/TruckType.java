package Three.threeOne.homeWork.threeThree.entity.types;

import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByPurpose;
import Three.threeOne.homeWork.threeThree.enums.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
