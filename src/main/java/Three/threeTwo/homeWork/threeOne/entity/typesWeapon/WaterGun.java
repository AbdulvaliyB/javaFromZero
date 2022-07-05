package Three.threeTwo.homeWork.threeOne.entity.typesWeapon;

import Three.threeTwo.homeWork.threeOne.entity.Weapon;

public class WaterGun implements Weapon {

    public WaterGun() {
    }

    @Override
    public void shot() {
                System.out.print("Pew-pew-pew");
    }
}
