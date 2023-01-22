public class Boss extends GameEntity{
    public Weapon BossWeapon;


    public Boss (int Health, int Damage, Weapon BossWeapon){
        super(Health, Damage);
        this.BossWeapon= BossWeapon;
}

    public Weapon getBossWeapon() {
        return BossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        BossWeapon = bossWeapon;
    }

    public  String info(){
        return super.info() + " Weapon name: " + BossWeapon.getWeaponName() + " Weapon Type: " + BossWeapon.getType();
}


}

