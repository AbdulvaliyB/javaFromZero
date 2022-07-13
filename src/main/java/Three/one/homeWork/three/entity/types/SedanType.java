package Three.one.homeWork.three.entity.types;

import Three.one.homeWork.three.entity.VehicleTypeByBodyTypes;
import Three.one.homeWork.three.enums.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
