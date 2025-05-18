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
    


}
