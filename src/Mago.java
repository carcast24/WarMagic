public class Mago extends Character{
    public Mago(String name, int lifePoints, Weapon weapon){
        super (name, " Mago del Caos ", lifePoints, weapon);
    }
    @Override // permite sobre escribir un metodo
    public void atackSimple (Character opponent){
        System.out.println(" Hechizo Maldicion del caos...");
        super.atackSimple(opponent);

    }
    @Override
    public void attackWithWeapon(Character opponent){
        System.out.println(this.getName() + " usa su Arma!");
        super.attackWithWeapon(opponent);
    }
}
