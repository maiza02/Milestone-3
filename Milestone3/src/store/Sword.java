package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code
import java.util.Objects;

/**
 * Represents a sword, implementing the Weapon and QuantityAdjustable interfaces.
 * Swords are items with a name, description, price, attack damage, durability, weapon type, and quantity.
 */
public class Sword implements Weapon, QuantityAdjustable {
    private String name;
    private String description;
    private double price;
    private int attackDamage;
    private int durability;
    private String weaponType;
    private int quantity;
    
    
    /**
     * Constructs a Sword with the specified attributes.
     *
     * @param name         The name of the sword.
     * @param description  The description of the sword.
     * @param price        The price of the sword.
     * @param attackDamage The attack damage of the sword.
     * @param durability   The durability of the sword.
     * @param weaponType   The type of weapon (e.g., Melee) of the sword.
    */
 public Sword(String name, String description, double price, int attackDamage, int durability, String weaponType) {
     this.name = name;
     this.description = description;
     this.price = price;
     this.attackDamage = attackDamage;
     this.durability = durability;
     this.weaponType = weaponType;
 }

 /**
  * Gets the name of the sword.
  *
  * @return The name of the sword.
  */
 @Override
 public String getName() {
     return name;
 }

 /**
  * Gets the description of the sword.
  *
  * @return The description of the sword.
  */
 @Override
 public String getDescription() {
     return description;
 }

 /**
  * Gets the price of the sword.
  *
  * @return The price of the sword.
  */
 @Override
 public double getPrice() {
     return price;
 }

 /**
  * Gets the attack damage of the sword.
  *
  * @return The attack damage of the sword.
  */
 @Override
 public int getAttackDamage() {
     return attackDamage;
 }

 /**
  * Gets the durability of the sword.
  *
  * @return The durability of the sword.
  */
 @Override
 public int getDurability() {
     return durability;
 }

 /**
  * Gets the weapon type of the sword.
  *
  * @return The weapon type of the sword.
  */
 @Override
 public String getWeaponType() {
     return weaponType;
 }


 /**
  * Checks if this sword is equal to another object.
  *
  * @param obj The object to compare.
  * @return True if the objects are equal, false otherwise.
  */
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Sword sword = (Sword) obj;
     return Objects.equals(name, sword.name);
 }

 /**
  * Generates a hash code for the sword based on its name.
  *
  * @return The hash code of the sword.
  */
 @Override
 public int hashCode() {
     return Objects.hash(name);
 }
 
 
 /**
  * Gets the quantity of the sword.
  *
  * @return The quantity of the sword.
  */
 @Override
 public int getQuantity() {

	 return quantity;
 }
 
 /**
  * Sets the quantity of the sword.
  *
  * @param quantity The new quantity of the sword.
  */
 @Override
 public void setQuantity(int quantity) {
	 this.quantity = quantity;
 }
}
