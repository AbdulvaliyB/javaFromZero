package Three.one.homeWork.three.entity;

public class VehicleTypeByBodyTypes extends VehicleType {

    public VehicleTypeByBodyTypes() {
        super("Vehicle type by body type");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}