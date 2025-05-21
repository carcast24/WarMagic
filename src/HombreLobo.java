public class HombreLobo extends Character{
    public HombreLobo(String name, int lifePoints, Weapon weapon){
        super(name," Alpha tribu de los crecientes ",lifePoints,weapon);
    }
    @Override // permite sobre escribir un metodo
    public void atackSimple (Character opponent){
        System.out.println(" Aturde con aullido! ");
        super.atackSimple(opponent);

    }
    @Override
    public void attackWithWeapon(Character opponent){
        System.out.println(this.getName() + " usa su Arma!");
        super.attackWithWeapon(opponent);
    }
}
