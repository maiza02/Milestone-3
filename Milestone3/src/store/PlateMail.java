package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code
import java.util.Objects;

/**
 * Represents plate mail, implementing the Weapon and QuantityAdjustable interfaces.
 * Plate mail is an item with a name, description, price, attack damage, durability, weapon type, and quantity.
 */
public class PlateMail implements Weapon, QuantityAdjustable {
 private String name;
 private String description;
 private double price;
 private int attackDamage;
 private int durability;
 private String weaponType;
 private int quantity;

 
 /**
  * Constructs plate mail with the specified attributes.
  *
  * @param name         The name of the plate mail.
  * @param description  The description of the plate mail.
  * @param price        The price of the plate mail.
  * @param attackDamage The attack damage of the plate mail.
  * @param durability   The durability of the plate mail.
  * @param weaponType   The type of weapon (e.g., Heavy) of the plate mail.
  */
 public PlateMail(String name, String description, double price, int attackDamage, int durability, String weaponType) {
     this.name = name;
     this.description = description;
     this.price = price;
     this.attackDamage = attackDamage;
     this.durability = durability;
     this.weaponType = weaponType;
 }

 /**
  * Gets the name of the plate mail.
  *
  * @return The name of the plate mail.
  */
 @Override
 public String getName() {
     return name;
 }

 /**
  * Gets the description of the plate mail.
  *
  * @return The description of the plate mail.
  */
 @Override
 public String getDescription() {
     return description;
 }

 /**
  * Gets the price of the plate mail.
  *
  * @return The price of the plate mail.
  */
 @Override
 public double getPrice() {
     return price;
 }

 /**
  * Gets the attack damage of the plate mail.
  *
  * @return The attack damage of the plate mail.
  */
 @Override
 public int getAttackDamage() {
     return attackDamage;
 }

 /**
  * Gets the durability of the plate mail.
  *
  * @return The durability of the plate mail.
  */
 @Override
 public int getDurability() {
     return durability;
 }

 /**
  * Gets the weapon type of the plate mail.
  *
  * @return The weapon type of the plate mail.
  */
 @Override
 public String getWeaponType() {
     return weaponType;
 }


 /**
  * Checks if this plate mail is equal to another object.
  *
  * @param obj The object to compare.
  * @return True if the objects are equal, false otherwise.
  */
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     PlateMail plateMail = (PlateMail) obj;
     return Objects.equals(name, plateMail.name);
 }

 /**
  * Generates a hash code for the plate mail based on its name.
  *
  * @return The hash code of the plate mail.
  */
 @Override
 public int hashCode() {
     return Objects.hash(name);
 }

 /**
  * Gets the quantity of the plate mail.
  *
  * @return The quantity of the plate mail.
  */
 @Override
 public int getQuantity() {
     return quantity;
 }

 /**
  * Sets the quantity of the plate mail.
  *
  * @param quantity The new quantity of the plate mail.
  */
 @Override
 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }
}