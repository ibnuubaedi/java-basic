package Section03.PracticeExercise;

public class ProductPrinter {

    public static void main(String[] args) {

        Product firstProduct = new Product("Indocafe Coffeemix",1500.0);
        Product secondProduct = new Product("Indomie Mie Goreng",3000.0);

        System.out.println("First Product Name : " + firstProduct.getName());
        System.out.println("First Product Price : " + firstProduct.getPrice());
        System.out.println("Second Product Name : " + secondProduct.getName());
        System.out.println("Second Product Price : " + secondProduct.getPrice());

        firstProduct.reducePrice(500.0);
        secondProduct.reducePrice(1000.0);


        System.out.println("First Product Price : " + firstProduct.getPrice());

        System.out.println("Second Product Price : " + secondProduct.getPrice());
    }

}
