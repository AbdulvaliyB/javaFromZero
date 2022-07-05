package Three.threeTwo.homeWork.threeOne.entity.typesWeapon;


import Three.threeTwo.homeWork.threeOne.entity.Weapon;

public class Rpg implements Weapon {

    public Rpg() {
    }

    @Override
    public void shot() {
        System.out.println("!!!BUM!!!");
    }
}
