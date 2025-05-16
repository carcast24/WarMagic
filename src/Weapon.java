public class Weapon {
    private String name;
    private String type;

    // constructor
    public Weapon(String name, String type){
        this.name = name;
        this.type = type;
    }

    // metodo
 public void useWeapon(Character use, Character opponent){
        if (use.getLifePoints() > 0 && opponent.getLifePoints() > 0){ // si la vida de personaje1 es mayor a 1 y oponente  igual
            int damageWeapon = (int)(Math.random() *(use.getDamageMax() - use.getDamageMin() + 1) + use.getDamageMin()); // se asigna un numero aleatorio entre 30 y 10
        }
 }// metodo incompleto, primero hacer metodo recibir daño en Character y atacar


}
