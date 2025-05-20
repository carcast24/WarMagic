public class ExtensorGarras extends Weapon{
    public ExtensorGarras(){// dejo por defecto el nombre
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
