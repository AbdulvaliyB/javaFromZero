package Three.threeOne.homeWork.threeThree.service;

import Three.threeOne.homeWork.threeThree.entity.VehicleAd;
import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByBodyTypes;
import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByFuelTypes;
import Three.threeOne.homeWork.threeThree.entity.VehicleTypeByPurpose;

import java.util.Arrays;

public class AdsService {
    @Override
    public String toString() {
        return "AdsService{" +
                "adList=" + Arrays.toString(adList) +
                '}';
    }

    private VehicleAd[] adList;

    public VehicleAd[] getAdList() {
        return adList;
    }

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByBodyTypes().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByFuelTypes().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                        vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                        ad.getVehicleTypeByFuelTypes().getTypeName());
            }
        }
    }

}