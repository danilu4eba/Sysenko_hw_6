public class GameEntity {
    private int Health;
    private int Damage;

    public int getHealth() {
        return Health;
    }

    public GameEntity(int health, int Damage) {
        this.Health = health;
        this.Damage = Damage;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String info() {
        return "Health: " + this.Health + " Damage: " + this.Damage;
    }
}
