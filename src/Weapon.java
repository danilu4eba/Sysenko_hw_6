public class Weapon {
    private WeaponType Type;
    private String WeaponName;

    public WeaponType getType() {
        return Type;
    }

    public Weapon(WeaponType Type, String WeaponName) {
        this.Type = Type;
        this.WeaponName=WeaponName;
    }


    public void setType(WeaponType type) {
        Type = type;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }


}
