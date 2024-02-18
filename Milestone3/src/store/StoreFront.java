package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code

import java.util.List;
import java.util.Scanner;

/**
 * Represents the main storefront application that allows users to interact with the inventory,
 * make purchases, cancel purchases, and leave the store.
 */
public class StoreFront {
	/**
     * The main entry point of the storefront application.
     *
     * @param args The command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Maiza's Emporium of Goods!");

        // Initialize Inventory Manager and Shopping Cart
        InventoryManager inventoryManager = new InventoryManager();
        ShoppingCart shoppingCart = new ShoppingCart();

        // Display Inventory
        System.out.println("Inventory:");
        List<Weapon> storeInventory = inventoryManager.getInventory();
        for (Weapon item : storeInventory) {
            System.out.println(item.getName() + " - " + item.getDescription() +
                    " - $" + item.getPrice() + " - Quantity: " + item.getQuantity());
        }

        // Display Shopping Cart (which should be initially empty)
        System.out.println("\nShopping Cart: " + getCartContents(shoppingCart));

        // User interaction loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nWould you like to purchase an item, cancel a previous purchase, or leave the store? (purchase/cancel/leave): ");
            String userAction = scanner.nextLine().toLowerCase();

            switch (userAction) {
                case "purchase":
                    System.out.print("What items would you like to purchase? Enter the item name: ");
                    String purchaseItemName = scanner.nextLine();

                    Weapon purchaseItem = findItemByName(purchaseItemName, storeInventory);
                    if (purchaseItem != null) {
                        System.out.print("Enter the quantity you want to purchase: ");
                        int quantityToPurchase = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        // Check if there is enough quantity in the inventory
                        if (quantityToPurchase <= purchaseItem.getQuantity()) {
                            // Add the selected item to the shopping cart
                            shoppingCart.addToCart(purchaseItem, quantityToPurchase);

                            // Update the inventory
                            inventoryManager.removeFromInventory(purchaseItem, quantityToPurchase);

                            // Display updated Shopping Cart and Inventory
                            System.out.println("\nShopping Cart: " + getCartContents(shoppingCart));
                            System.out.println("Updated Inventory:");
                            displayInventory(inventoryManager.getInventory());
                        } else {
                            System.out.println("Insufficient quantity in the inventory. Please check the quantity.");
                        }
                    } else {
                        System.out.println("Item not found in the inventory. Please check the item name.");
                    }
                    break;

                case "cancel":
                    System.out.print("What items would you like to cancel? Enter the item name: ");
                    String cancelItemName = scanner.nextLine();

                    Weapon cancelItem = findItemByName(cancelItemName, shoppingCart.getCartContents());
                    if (cancelItem != null) {
                        System.out.print("Enter the quantity you want to cancel: ");
                        int quantityToCancel = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        // Remove the selected item from the shopping cart
                        shoppingCart.removeFromCart(cancelItem, quantityToCancel);

                        // Update the inventory
                        inventoryManager.addToInventory(cancelItem, quantityToCancel);

                        // Display updated Shopping Cart and Inventory
                        System.out.println("\nShopping Cart: " + getCartContents(shoppingCart));
                        System.out.println("Inventory:");
                        displayInventory(inventoryManager.getInventory());
                    } else {
                        System.out.println("Item not found in the shopping cart. Please check the item name.");
                    }
                    break;

                case "leave":
                    System.out.println("Okay, Goodbye! Have a nice day!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input. Please enter 'purchase', 'cancel', or 'leave'.");
            }
        }
    }

    /**
     * Gets a formatted string representation of the contents of the shopping cart.
     *
     * @param shoppingCart The shopping cart.
     * @return The formatted string representation of the shopping cart contents.
     */
    private static String getCartContents(ShoppingCart shoppingCart) {
        List<Weapon> cartContents = shoppingCart.getCartContents();
        if (cartContents.isEmpty()) {
            return "Empty";
        } else {
            StringBuilder cartContentsStr = new StringBuilder();
            for (Weapon item : cartContents) {
                cartContentsStr.append(item.getName()).append(" (Quantity: ").append(shoppingCart.getQuantity(item)).append("), ");
            }
            // Remove the trailing comma and space
            return cartContentsStr.substring(0, cartContentsStr.length() - 2);
        }
    }

    /**
     * Displays the inventory items in a formatted manner.
     *
     * @param inventory The inventory to display.
     */
    private static void displayInventory(List<Weapon> inventory) {
        for (Weapon item : inventory) {
            System.out.println(item.getName() + " - " + item.getDescription() +
                    " - $" + item.getPrice() + " - Quantity: " + item.getQuantity());
        }
    }

    /**
     * Finds an item by name in a given list of items.
     *
     * @param itemName The name of the item to find.
     * @param itemList The list of items to search.
     * @return The found item, or null if not found.
     */
    private static Weapon findItemByName(String itemName, List<Weapon> itemList) {
        for (Weapon item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}