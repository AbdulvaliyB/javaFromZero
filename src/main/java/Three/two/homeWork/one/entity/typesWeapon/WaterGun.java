package Three.two.homeWork.one.entity.typesWeapon;

import Three.two.homeWork.one.entity.Weapon;

public class WaterGun implements Weapon {

    public WaterGun() {
    }

    @Override
    public void shot() {
                System.out.print("Pew-pew-pew");
    }
}
