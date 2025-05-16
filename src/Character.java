public class Character {
    private String name;
    private String characterClass;
    private int lifePoints;
    private int damageMax;
    private int damageMin;
    private Guns guns;

    // constructor
    public Character(String name, String characterClass, int lifePoints, int damageMax, int damageMin, Guns guns){
        this.name = name;
        this.characterClass = characterClass;
        this.lifePoints = 100;
        this.damageMax = 30;
        this.damageMin = 20;
        this.guns = guns;
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


}
