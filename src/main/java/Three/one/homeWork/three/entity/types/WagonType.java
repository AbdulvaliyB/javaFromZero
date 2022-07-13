package Three.one.homeWork.three.entity.types;

import Three.one.homeWork.three.entity.VehicleTypeByBodyTypes;
import Three.one.homeWork.three.enums.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
