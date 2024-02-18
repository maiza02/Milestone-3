package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code

import java.util.Objects;

/**
 * Represents a bow, implementing the Weapon and QuantityAdjustable interfaces.
 * Bows are items with a name, description, price, attack damage, durability, weapon type, and quantity.
 */
public class Bow implements Weapon, QuantityAdjustable {
    private String name;
    private String description;
    private double price;
    private int attackDamage;
    private int durability;
    private String weaponType;
    private int quantity;

    /**
     * Constructs a Bow with the specified attributes.
     *
     * @param name         The name of the bow.
     * @param description  The description of the bow.
     * @param price        The price of the bow.
     * @param attackDamage The attack damage of the bow.
     * @param durability   The durability of the bow.
     * @param weaponType   The type of weapon (e.g., Ranged) of the bow.
     */ 
    public Bow(String name, String description, double price, int attackDamage, int durability, String weaponType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.attackDamage = attackDamage;
        this.durability = durability;
        this.weaponType = weaponType;
    }

    /**
     * Gets the name of the bow.
     *
     * @return The name of the bow.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the bow.
     *
     * @return The description of the bow.
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Gets the price of the bow.
     *
     * @return The price of the bow.
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Gets the attack damage of the bow.
     *
     * @return The attack damage of the bow.
     */
    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Gets the durability of the bow.
     *
     * @return The durability of the bow.
     */
    @Override
    public int getDurability() {
        return durability;
    }

    /**
     * Gets the weapon type of the bow.
     *
     * @return The weapon type of the bow.
     */
    @Override
    public String getWeaponType() {
        return weaponType;
    }

    
    /**
     * Checks if this bow is equal to another object.
     *
     * @param obj The object to compare.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bow bow = (Bow) obj;
        return Objects.equals(name, bow.name);
    }

    /**
     * Generates a hash code for the bow based on its name.
     *
     * @return The hash code of the bow.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
  
    /**
     * Gets the quantity of the bow.
     *
     * @return The quantity of the bow.
     */
    @Override
    public int getQuantity() {
        return quantity;
    }

    
    /**
     * Sets the quantity of the bow.
     *
     * @param quantity The new quantity of the bow.
     */
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
