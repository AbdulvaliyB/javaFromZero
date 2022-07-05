package Three.threeTwo.homeWork.threeOne.entity.typesWeapon;

import Three.threeTwo.homeWork.threeOne.entity.Weapon;

public class MachineGun implements Weapon {

    public MachineGun() {
    }

    @Override
    public void shot() {
        System.out.println("Rat-tat-tat-tat-tat-....");
    }
}
