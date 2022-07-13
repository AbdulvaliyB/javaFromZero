package Three.two.homeWork.one.entity.typesWeapon;

import Three.two.homeWork.one.entity.Weapon;

public class Pistol implements Weapon {


    public Pistol() {
    }

    @Override
    public void shot() {
        System.out.println("Bang-bang");
    }
}
