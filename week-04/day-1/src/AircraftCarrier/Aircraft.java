package AircraftCarrier;

public class Aircraft {
    int maxAmmo;
    int baseDamage;
    int ammunition;
    String type;

    public Aircraft() {
    }

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.type = type;
        ammunition = 0;
    }

    public int fight() {
        int damage = ammunition * baseDamage;
        ammunition = 0;
        return damage;
    }

    public int refill(int fill) {
        if (fill >= (maxAmmo - ammunition)) {
            fill = fill - (maxAmmo - ammunition);
            ammunition = maxAmmo;
        } else {
            ammunition = fill;
            fill = 0;
        }
        return fill;
    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        return "Type " + type + ", Ammo: " + ammunition + ", Base Damage: " + baseDamage + ", All Damage: " + ammunition*baseDamage;
    }

    public boolean isPriority() {
        return type.equals("F35");
    }
}
