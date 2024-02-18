package store;
//Maiza Falcon Rojas
//CST-239
//02/16/2024
//This is my own code

/**
 * Represents an object that can have an adjustable quantity.
 */
public interface QuantityAdjustable {
	
	/**
     * Gets the current quantity of the object.
     *
     * @return The current quantity of the object.
     */
    int getQuantity();
    
    /**
     * Sets the quantity of the object to the specified value.
     *
     * @param quantity The new quantity to set for the object.
     */
    void setQuantity(int quantity);
}