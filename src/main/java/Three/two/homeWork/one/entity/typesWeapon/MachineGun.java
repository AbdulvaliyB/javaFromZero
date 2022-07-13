package Three.two.homeWork.one.entity.typesWeapon;

import Three.two.homeWork.one.entity.Weapon;

public class MachineGun implements Weapon {

    public MachineGun() {
    }

    @Override
    public void shot() {
        System.out.println("Rat-tat-tat-tat-tat-....");
    }
}
