public class Vampiro extends Character {
    public Vampiro(String name, int lifePoints, Weapon weapon){
        super (name,"Teniente de la orden Oscura", lifePoints,weapon);
    }
    @Override // permite sobre escribir un metodo
    public void atackSimple (Character opponent){
        System.out.println("Ataque Frontal");
        super.atackSimple(opponent);

    }
    @Override
    public void attackWithWeapon(Character opponent){
        System.out.println(this.getName() + " usa arma");
        super.attackWithWeapon(opponent);
    }
}
