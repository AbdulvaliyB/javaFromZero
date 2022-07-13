package Three.two.homeWork.one.entity.typesWeapon;


import Three.two.homeWork.one.entity.Weapon;

public class Rpg implements Weapon {

    public Rpg() {
    }

    @Override
    public void shot() {
        System.out.println("!!!BUM!!!");
    }
}
