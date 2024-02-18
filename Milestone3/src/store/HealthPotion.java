package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code
import java.util.Objects;

/**
 * Represents a health potion that implements the Weapon and QuantityAdjustable interfaces.
 */
public class HealthPotion implements Weapon, QuantityAdjustable {
    private String name;
    private String description;
    private double price;
    private int quantity;

  /**
   * Constructs a HealthPotion with the specified name, description, price, and healing amount.
   *
   * @param name           The name of the health potion.
   * @param description    The description of the health potion.
   * @param price          The price of the health potion.
 * @param i 
   * @param healingAmount  The amount of health the potion restores.
   */    
 public HealthPotion(String name, String description, double price, int i) {
     this.name = name;
     this.description = description;
     this.price = price;
 
 }
 
 /**
  * Gets the name of the health potion.
  *
  * @return The name of the health potion.
  */
 @Override
 public String getName() {
     return name;
 }

 /**
  * Gets the description of the health potion.
  *
  * @return The description of the health potion.
  */
 @Override
 public String getDescription() {
     return description;
 }

 /**
  * Gets the price of the health potion.
  *
  * @return The price of the health potion.
  */
 @Override
 public double getPrice() {
     return price;
 }

 /**
  * Gets the attack damage of the health potion (always 0 for a healing item).
  *
  * @return The attack damage (always 0 for healing items).
  */
 @Override
 public int getAttackDamage() {
     return 0;  
 }

 /**
  * Gets the durability of the health potion (always 0 for a healing item).
  *
  * @return The durability (always 0 for healing items).
  */
 @Override
 public int getDurability() {
     return 0;  
 }

 /**
  * Gets the weapon type of the health potion (always "Healing" for a healing item).
  *
  * @return The weapon type (always "Healing" for healing items).
  */
 @Override
 public String getWeaponType() {
     return "Healing"; 
 }

 /**
  * Checks if this health potion is equal to another object.
  *
  * @param obj The object to compare.
  * @return True if the objects are equal, false otherwise.
  */
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     HealthPotion healthPotion = (HealthPotion) obj;
     return Objects.equals(name, healthPotion.name);
 }

 /**
  * Generates a hash code for the health potion based on its name.
  *
  * @return The hash code of the health potion.
  */
 @Override
 public int hashCode() {
     return Objects.hash(name);
 }
 
 
 /**
  * Gets the quantity of the health potion.
  *
  * @return The quantity of the health potion.
  */
 @Override
 public int getQuantity() {
     return quantity;
 }

 
 /**
  * Sets the quantity of the health potion.
  *
  * @param quantity The new quantity of the health potion.
  */
 @Override
 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }
}