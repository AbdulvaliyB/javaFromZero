package Three.threeOne.homeWork.threeThree.entity.types;

import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByPurpose;
import Three.threeOne.homeWork.threeThree.enums.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
