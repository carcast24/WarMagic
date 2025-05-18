public class Character {
    private String name;
    private String characterClass;
    private int lifePoints;
    private int damageMax = 30;
    private int damageMin = 10;
    private Weapon weapon;

    // constructor
    public Character(String name, String characterClass, int lifePoints, Weapon weapon){
        this.name = name;
        this.characterClass = characterClass;
        this.lifePoints = 100;
        this.weapon = null;
    }

    //Getter
    public String getName(){
        return name;
    }

    public String getCharacterClass(){
        return characterClass;
    }

    public int getLifePoints(){
        return lifePoints;
    }

    public int getDamageMax(){
        return damageMax;
    }

    public int getDamageMin(){
        return damageMin;
    }

    public Weapon getWeapon(){
        return weapon;
    }
    // metodo atacar 

    public void atackSimple (Character attacker, Character opponent){
        if (attacker.getLifePoints() >0 && opponent.getLifePoints() > 0) {
            int max = getDamageMax();
            int min = getDamageMin();
            int damage = (int)(Math.random() * (max - min + 1) + min);

            // se aplica el daño
            opponent.takeDamage(damage);

            // mensaje de accion

            System.out.println(attacker.getName() + "ataco a " + opponent.getName() + "\n" +
                                "daño causado es: " + damage + "vida restante de " + opponent.getName() + "\n" + 
                                opponent.getLifePoints());


        }
    }

    // metodo recibir daño
    public void takeDamage(int damage){
        this.lifePoints -= damage;

        // validacion para evitar negativos
        if (this.lifePoints < 0){
            this.lifePoints = 0;
        }
    }

    // metodo esta vivo

    public boolean isAlive(){
        return this.lifePoints > 0; // evalua si lifePoints es mayor a cero y devuelve true o false

    }

    // atacar con arma
    // evalua si el peronaje tiene un arma, si esta vivo y si el oponente esta vivo
    private void attackWithWeapon(Character opponent){
        int damage = 0;
        if (this.weapon != null && this.isAlive() && opponent.isAlive()){
            damage = weapon.generateDamage();
        }
        opponent.takeDamage(damage);

    }





}
