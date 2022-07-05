package Three.threeTwo.homeWork.threeOne.entity.typesWeapon;

import Three.threeTwo.homeWork.threeOne.entity.Weapon;

public class Pistol implements Weapon {


    public Pistol() {
    }

    @Override
    public void shot() {
        System.out.println("Bang-bang");
    }
}
