public class ExtensorGarras extends Weapon{
    public ExtensorGarras(String name, String type){
        super("Garras de Kalion", "Tesoro Divino");
    }
    @Override
    public int generateDamage(Character user){
        int baseDamage = super.generateDamage(); // asigno el valor base de la clase padre
        if (user instanceof HombreLobo){
            return baseDamage + 5;
        }else{
            return baseDamage - 4;
        }
    }
}
