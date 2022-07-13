package Three.two.homeWork.one;

import Three.two.homeWork.one.entity.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose;

        Player player = new Player();

        System.out.println("""
                Welcome to game new player!
                
                You will have only 2 slots of weapons!
                
                In this game you can use Pistol, Machine gun, RPG, Slingshot and Water gun.
                """);
        choose=0;

        while (choose!=-1) {
            System.out.println("\nChoose from which weapon do you wanna shoot\n");
            for (int i = 1; i <=player.getWeaponSlots().length; i++) {
                System.out.println(i+" - "+ player.getWeaponSlots()[i-1].getClass().getSimpleName());
            }
            System.out.print("-1 - Exit\n\nEnter: ");
        choose=scanner.nextInt();
        if(choose == -1){
            break;
        }else if(choose>=1&&choose<6){
            System.out.println("\n");
            player.shotWithWeapon(choose-1);
        }else{
            System.out.println("\nWrong number!\nTry again!");
        }
        }
        System.out.println("Game over!\nThanks for playing this game");
    }
}
