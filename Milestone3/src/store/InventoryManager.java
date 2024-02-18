package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages the inventory of weapons in a store.
 */
public class InventoryManager {
    private List<Weapon> inventory;

    /**
     * Constructs an InventoryManager and initializes the inventory.
     */
    public InventoryManager() {
        initializeInventory();
    }

    /**
     * Initializes the inventory with various weapons and sets their quantities.
     */
    private void initializeInventory() {
        inventory = new ArrayList<>();
        // Create and add swords to the inventory
        Sword sword = new Sword("Sword", "Sharp and deadly", 50.0, 10, 20, "Melee");
        sword.setQuantity(10);  
        inventory.add(sword);
        
        // Create and add bows to the inventory
        Bow bow = new Bow("Bow", "Great for ranged attacks", 40.0, 15, 15, "Ranged");
        bow.setQuantity(15);   
        inventory.add(bow);
        
     // Create and add plate mails to the inventory
        PlateMail plateMail = new PlateMail("Plate Mail", "Heavy protection", 80.0, 5, 30, "Heavy");
        plateMail.setQuantity(5);  
        inventory.add(plateMail);
  

        // Create and add leather armors to the inventory
        LeatherArmor leatherArmor = new LeatherArmor("Leather Armor", "Light and flexible", 30.0, 8, 15, "Light");
        leatherArmor.setQuantity(8);  
        inventory.add(leatherArmor);
        
        // Create and add health potions to the inventory
        HealthPotion healthPotion = new HealthPotion("Health Potion", "Restores health", 10.0, 20);
        healthPotion.setQuantity(20);  
        inventory.add(healthPotion);
        
     // Sort the inventory based on natural ordering (compareTo method)
        Collections.sort(inventory);
    }
    
   
    /**
     * Removes a specified quantity of a weapon from the inventory.
     *
     * @param item     The weapon to be removed.
     * @param quantity The quantity of the weapon to be removed.
     */
    public void removeFromInventory(Weapon item, int quantity) {
        Weapon inventoryItem = findInventoryItem(item);
        if (inventoryItem != null) {
            int currentQuantity = inventoryItem.getQuantity();
            if (quantity < currentQuantity) {
                inventoryItem.setQuantity(currentQuantity - quantity);
            } else {
                inventory.remove(inventoryItem);
            }
        }
    }

    /**
     * Adds a specified quantity of a weapon to the inventory.
     *
     * @param item     The weapon to be added.
     * @param quantity The quantity of the weapon to be added.
     */
    public void addToInventory(Weapon item, int quantity) {
        Weapon inventoryItem = findInventoryItem(item);
        if (inventoryItem != null) {
            inventoryItem.setQuantity(inventoryItem.getQuantity() + quantity);
        } else {
            inventory.add(item); // Add the item if not found in the inventory
        }
        // Sort the inventory after adding/updating a new item
        Collections.sort(inventory);
    }

    /**
     * Finds a specific weapon in the inventory.
     *
     * @param item The weapon to find.
     * @return The found weapon or null if not found.
     */
    private Weapon findInventoryItem(Weapon item) {
        for (Weapon inventoryItem : inventory) {
            if (inventoryItem.equals(item)) {
                return inventoryItem;
            }
        }
        return null;
    }

    /**
     * Gets an unmodifiable view of the inventory.
     *
     * @return Unmodifiable list of weapons in the inventory.
     */
    public List<Weapon> getInventory() {
        return Collections.unmodifiableList(inventory);
    }
}