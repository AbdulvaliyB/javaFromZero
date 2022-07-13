package Three.one.homeWork.three;

import Three.one.homeWork.three.entity.VehicleAd;
import Three.one.homeWork.three.entity.types.*;
import Three.one.homeWork.three.service.AdsService;

public class Main {

    public static void main(String[] args) {

        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "1", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "2", new TruckType(),
                new PickupType(), new DieselType());



//        adsService.filterByVehicleTypeByPurpose(new PassengerType());
//        adsService.filterByVehicleTypeByPurpose(new TruckType());

        VehicleAd gentraAd = new VehicleAd("Gentra","3",new CarType(),new SedanType(),new PetrolType());
        VehicleAd busAd = new VehicleAd("Bus 147","4",new PassengerType(),new BusType(),new ElectricType());

        adsService.setAdList(new VehicleAd[] {volvoAd,kamazAd,gentraAd,busAd});

        adsService.filterByVehicleTypeByPurpose(new TruckType());
        System.out.println("\n\n\n");


        adsService.filterByVehicleTypeByBodyTypes(new SedanType());
        System.out.println("\n\n\n");


        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
        System.out.println("\n\n\n");



        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом


    }
}
