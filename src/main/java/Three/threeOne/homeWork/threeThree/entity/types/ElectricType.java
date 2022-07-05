package Three.threeOne.homeWork.threeThree.entity.types;

import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByFuelTypes;
import Three.threeOne.homeWork.threeThree.enums.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
