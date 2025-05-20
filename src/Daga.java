public class Daga extends Weapon{
    public Daga(String name, String type){
        super("Daga Sagrada", "Oscura");
    }
    //sobre escribe metodo
    @Override
    public int generateDamage(Character user){
        int baseDamage = super.generateDamage(); // asigno el valor base de la clase padre
        if (user instanceof Vampiro){
            return baseDamage + 5;
        }else{
            return baseDamage - 3;
        }
    }
}
