package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code

import java.util.Objects;


/**
 * Represents leather armor, implementing the Weapon and QuantityAdjustable interfaces.
 * Leather armor is an item with a name, description, price, attack damage, durability, weapon type, and quantity.
 */
public class LeatherArmor implements Weapon, QuantityAdjustable {
 private String name;
 private String description;
 private double price;
 private int attackDamage;
 private int durability;
 private String weaponType;
 private int quantity;

 /**
  * Constructs leather armor with the specified attributes.
  *
  * @param name         The name of the leather armor.
  * @param description  The description of the leather armor.
  * @param price        The price of the leather armor.
  * @param attackDamage The attack damage of the leather armor.
  * @param durability   The durability of the leather armor.
  * @param weaponType   The type of weapon (e.g., Light) of the leather armor.
  */
 public LeatherArmor(String name, String description, double price, int attackDamage, int durability, String weaponType) {
     this.name = name;
     this.description = description;
     this.price = price;
     this.attackDamage = attackDamage;
     this.durability = durability;
     this.weaponType = weaponType;
 }

 /**
  * Gets the name of the leather armor.
  *
  * @return The name of the leather armor.
  */
 @Override
 public String getName() {
     return name;
 }

 /**
  * Gets the description of the leather armor.
  *
  * @return The description of the leather armor.
  */
 @Override
 public String getDescription() {
     return description;
 }

 /**
  * Gets the price of the leather armor.
  *
  * @return The price of the leather armor.
  */
 @Override
 public double getPrice() {
     return price;
 }

 
 /**
  * Gets the attack damage of the leather armor.
  *
  * @return The attack damage of the leather armor.
  */
 @Override
 public int getAttackDamage() {
     return attackDamage;
 }

 /**
  * Gets the durability of the leather armor.
  *
  * @return The durability of the leather armor.
  */
 @Override
 public int getDurability() {
     return durability;
 }

 /**
  * Gets the weapon type of the leather armor.
  *
  * @return The weapon type of the leather armor.
  */
 @Override
 public String getWeaponType() {
     return weaponType;
 }

 /**
  * Checks if this leather armor is equal to another object.
  *
  * @param obj The object to compare.
  * @return True if the objects are equal, false otherwise.
  */
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     LeatherArmor leatherArmor = (LeatherArmor) obj;
     return Objects.equals(name, leatherArmor.name);
 }

 /**
  * Generates a hash code for the leather armor based on its name.
  *
  * @return The hash code of the leather armor.
  */
 @Override
 public int hashCode() {
     return Objects.hash(name);
 }

 /**
  * Gets the quantity of the leather armor.
  *
  * @return The quantity of the leather armor.
  */
 @Override
 public int getQuantity() {
     return quantity;
 }

 /**
  * Sets the quantity of the leather armor.
  *
  * @param quantity The new quantity of the leather armor.
  */
 @Override
 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }
}