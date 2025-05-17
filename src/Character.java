public class Character {
    private String name;
    private String characterClass;
    private int lifePoints;
    private int damageMax = 30;
    private int damageMin = 10;
    private Guns guns;

    // constructor
    public Character(String name, String characterClass, int lifePoints, Guns guns){
        this.name = name;
        this.characterClass = characterClass;
        this.lifePoints = 100;
        this.guns = null;
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

    public Guns getGuns(){
        return guns;
    }
    // metodo atacar 

    public void atackSimple (Character user1, Character opponent){
        if (user1.getLifePoints() >0 && opponent.getLifePoints() > 0) {
            int max = getDamageMax();
            int min = getDamageMin();
            int damage = (int)(Math.random() * (max - min + 1) + min);

            // se aplica el daño
            opponent.LifePoints -= damage;

            // evitar vida negativa 

            if (opponent.lifePoints < 0) {
            opponent.lifePoints = 0;
            }
            // mensaje de accion

            System.out.println(user1.getName() + "ataco a " + opponent.getName() + "\n" +
                                "daño causado es: " + damage + "vida restante de " + opponent.getName() + "\n" + 
                                opponent.getLifePoints());


        }
    }





}
