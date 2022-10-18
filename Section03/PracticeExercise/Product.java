package Section03.PracticeExercise;

/**
 * Product consists of name, price, and price reduction.
 */
public class Product {

    /**
     * Name of product
     */
    private String name;

    /**
     * Price of product
     */
    private double price;

    /**
     * Construct product with name and price.
     * @param name of product
     * @param price of product
     */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    /**
     * Get product name.
     * @return name of product.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Get product price.
     * @return price of product.
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Reduce price from product price.
     */
    public void reducePrice(double reduction){
        this.price = this.price - reduction;
    }

}
