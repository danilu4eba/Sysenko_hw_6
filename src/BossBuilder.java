public class BossBuilder {
    private int health;
    private int damage;
    private Weapon bossWeapon;

    public BossBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public BossBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public BossBuilder setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
        return this;
    }

    public Boss createBoss() {
        return new Boss(health, damage, bossWeapon);
    }
}