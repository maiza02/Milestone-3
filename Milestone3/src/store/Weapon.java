package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code

/**
 * Represents a weapon that can be used in the inventory system.
 * This interface extends Comparable to provide a natural ordering based on the weapon names.
 * It also extends QuantityAdjustable to manage the quantity of weapons.
 */
public interface Weapon extends Comparable<Weapon>, QuantityAdjustable {
	 /**
     * Gets the name of the weapon.
     *
     * @return The name of the weapon.
     */
	String getName();
	 /**
     * Gets the description of the weapon.
     *
     * @return The description of the weapon.
     */
    String getDescription();
    /**
     * Gets the price of the weapon.
     *
     * @return The price of the weapon.
     */
    double getPrice();
    /**
     * Gets the attack damage of the weapon.
     *
     * @return The attack damage of the weapon.
     */
    int getAttackDamage();
    /**
     * Gets the durability of the weapon.
     *
     * @return The durability of the weapon.
     */
    int getDurability();
    /**
     * Gets the quantity of the weapon.
     *
     * @return The quantity of the weapon.
     */
    String getWeaponType();
    /**
     * Gets the quantity of the weapon.
     *
     * @return The quantity of the weapon.
     */
    int getQuantity();
    
    /**
     * Compares this weapon with another weapon based on their names.
     * This comparison is case-insensitive.
     *
     * @param otherWeapon The weapon to compare with.
     * @return A negative integer, zero, or a positive integer as this weapon is less than, equal to,
     *         or greater than the specified weapon.
     */
    @Override
    default int compareTo(Weapon otherWeapon) {
        // Compare based on the name, ignoring case
        return this.getName().compareToIgnoreCase(otherWeapon.getName());
    }
}


   