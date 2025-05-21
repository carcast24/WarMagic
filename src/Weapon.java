public class Weapon {
    private String name;
    private String type;
    private int damageMax = 40;
    private int damageMin = 20;


    // constructor
    public Weapon(String name, String type){
        this.name = name;
        this.type = type;
    }

    // metodos getter

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getDamageMax(){
        return damageMax;
    }

    public int getDamageMin(){
        return damageMin;
    }

    // metodo generar daño

    public int generateDamage(){
        return (int)(Math.random() * (damageMax - damageMin + 1) + damageMin); // genera un numero de 20 al 40

    }
    // sobrecargado, si se quiere usar con una clase especifica
    public int generateDamage(Character user){
        return generateDamage();
        // genera un numero de 20 al 40

    }
    public String toString(){
        return this.name;
    }



}
