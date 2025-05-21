public class Baculo extends Weapon{
    public Baculo(){ //dejo por  defecto los nombres
        super("Mil almas del caos","Infernal");
    }

    /**
     * estoy sobre escribe
     *
     */
    @Override
    public int generateDamage(Character user){
        int baseDamage = super.generateDamage(); // asigno el valor base de la clase padre
        if (user instanceof Mago){
            return baseDamage + 5;
        }else{
            return baseDamage - 3;
        }
    }
    @Override
    public String toString() {
        return getName();
    }
}
