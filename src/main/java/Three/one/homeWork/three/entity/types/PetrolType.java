package Three.one.homeWork.three.entity.types;

import Three.one.homeWork.three.entity.VehicleTypeByFuelTypes;
import Three.one.homeWork.three.enums.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
