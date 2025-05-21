public class FightingGame {
    private Character user1;
    private Character user2;

    // constructor
    public FightingGame(Character user1, Character user2){
        this.user1 = user1;
        this.user2 = user2;
    }

    // metodo turn

    public void turn(Character attacker, Character opponent){
        if (attacker.getWeapon()  != null){
            attacker.attackWithWeapon(opponent);
        } else {
            attacker.atackSimple(opponent);
        }

    }
    // metodo startFight

    public void startFight(){
        System.out.println("Inicia la lucha entre " + "\n" +
                            user1.getName() + " y " + user2.getName() );
        System.out.println("___________________________________________");
        int ronda = 1;

        while(user1.isAlive() && user2.isAlive()){ // el loop funciona solo si ambos usuarios estan con vida

            System.out.println("----- Ronda " + ronda + "-----");

            turn(user1,user2); // se ejecuta el primer ataque
            System.out.println("___________________________________________");

            if (user2.isAlive()){ // se evalua si el personaje esta vivo si es asi
                turn(user2,user1); // se ejecuta el segundo ataque invirtiendo los roles
                System.out.println("___________________________________________");
            }
            ronda++; // se aumenta la vaeiable ronda en 1
        }

        // cuando uno de los dos quede en cero osea isAlive es false
        // se evalua y se da el veredicto con un if condicional
        System.out.println("___________________________________________");
        if (user1.isAlive()){
            System.out.println(" jugador " + user1.getName() + " a ganado la batalla!!");
        }else{
            System.out.println(" jugador " + user2.getName() + " a ganado la batalla!!");
        }
    }


}

