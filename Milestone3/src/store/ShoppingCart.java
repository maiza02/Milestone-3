package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart for weapons.
 */
public class ShoppingCart {
    private List<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    /**
     * Adds a weapon to the shopping cart with the specified quantity.
     *
     * @param item     The weapon to be added.
     * @param quantity The quantity of the weapon to be added.
     */
    public void addToCart(Weapon item, int quantity) {
        CartItem cartItem = new CartItem(item, quantity);
        cartItems.add(cartItem);
    }

    /**
     * Removes a specified quantity of a weapon from the shopping cart.
     *
     * @param item     The weapon to be removed.
     * @param quantity The quantity of the weapon to be removed.
     */
    public void removeFromCart(Weapon item, int quantity) {
        CartItem cartItem = findCartItem(item);
        if (cartItem != null) {
            int currentQuantity = cartItem.getQuantity();
            if (quantity < currentQuantity) {
                cartItem.setQuantity(currentQuantity - quantity);
            } else {
                cartItems.remove(cartItem);
            }
        }
    }

    /**
     * Gets the quantity of a specific weapon in the shopping cart.
     *
     * @param item The weapon to get the quantity for.
     * @return The quantity of the specified weapon in the shopping cart.
     */
    public int getQuantity(Weapon item) {
        CartItem cartItem = findCartItem(item);
        return (cartItem != null) ? cartItem.getQuantity() : 0;
    }

    
    /**
     * Finds a CartItem object for a specified weapon in the shopping cart.
     *
     * @param item The weapon to find in the cart.
     * @return The CartItem object if found, otherwise null.
     */
    private CartItem findCartItem(Weapon item) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getItem().equals(item)) {
                return cartItem;
            }
        }
        return null;
    }

    /**
     * Gets the list of weapons in the shopping cart.
     *
     * @return List of weapons in the shopping cart.
     */
    public List<Weapon> getCartContents() {
        List<Weapon> contents = new ArrayList<>();
        for (CartItem cartItem : cartItems) {
            contents.add(cartItem.getItem());
        }
        return contents;
    }

    /**
     * Represents an item in the shopping cart with its quantity.
     */
    private static class CartItem {
        private Weapon item;
        private int quantity;

        
        /**
         * Constructs a CartItem with a weapon and quantity.
         *
         * @param item     The weapon.
         * @param quantity The quantity of the weapon.
         */
        public CartItem(Weapon item, int quantity) {
            this.item = item;
            this.quantity = quantity;
        }

        
        /**
         * Gets the weapon in the CartItem.
         *
         * @return The weapon.
         */
        public Weapon getItem() {
            return item;
        }

        /**
         * Gets the quantity of the weapon in the CartItem.
         *
         * @return The quantity of the weapon.
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the quantity of the weapon in the CartItem.
         *
         * @param quantity The new quantity of the weapon.
         */
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
