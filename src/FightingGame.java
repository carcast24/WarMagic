public class FightingGame {
    private Character user1;
    private Character user2;

    // constructor
    public FightingGame(Character user1, Character user2){
        this.user1 = user1;
        this.user2 = user2;
    }

    // metodo turn

    private void turn(Character attacker, Character opponent){
        if (attacker.getWeapon()  != null){
            attacker.attackWithWeapon(opponent);
        } else {
            attacker.atackSimple(opponent);
        }

    }

}
/**
 * me falta implementar el metodo starFight y crear las herencias de la clase Character
 * y la clase Weapon
 */
