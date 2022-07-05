package Three.threeOne.homeWork.threeThree.entity.types;

import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByPurpose;
import Three.threeOne.homeWork.threeThree.enums.VehicleTypeEnum;

public class CarType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
