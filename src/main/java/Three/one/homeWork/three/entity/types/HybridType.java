package Three.one.homeWork.three.entity.types;

import Three.one.homeWork.three.entity.VehicleTypeByFuelTypes;
import Three.one.homeWork.three.enums.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
