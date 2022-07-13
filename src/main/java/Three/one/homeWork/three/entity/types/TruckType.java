package Three.one.homeWork.three.entity.types;

import Three.one.homeWork.three.entity.VehicleTypeByPurpose;
import Three.one.homeWork.three.enums.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
