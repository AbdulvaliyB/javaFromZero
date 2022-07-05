package Three.threeTwo.homeWork.threeOne.entity;

import Three.threeTwo.homeWork.threeOne.entity.typesWeapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;


    public Player() {
        // Снаряжаем нашего игрока
//        Weapon pistol =new Pistol();
        weaponSlots = new Weapon[5] ;
        weaponSlots[0]=new Pistol();
        weaponSlots[1]=new MachineGun();
        weaponSlots[2]=new Rpg();
        weaponSlots[3]=new Slingshot();
        weaponSlots[4]=new WaterGun();
    }

    public Weapon[] getWeaponSlots() {
        return weaponSlots;
    }
    public Weapon getWeapon(int slot){
        return weaponSlots[slot-1];
    }

    public void setWeaponSlots(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
    }

    public void shotWithWeapon(int slot) {

        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
