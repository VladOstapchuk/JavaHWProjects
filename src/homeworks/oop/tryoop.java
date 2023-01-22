package homeworks.oop;


public class tryoop {
    public static void main(String[] args) {
        ProductDescription product1 = new ProductDescription();
        ProductDescription product2 = new ProductDescription();
        ProductDescription product3 = new ProductDescription();

        product1.setPrice(11);
        product1.setWeight(4);
        product1.setDescription("SuperTV-50");

        product2.setPrice(22);
        product2.setWeight(5);
        product2.setDescription("Jacket");

        product3.setPrice(100);
        product3.setWeight(2000);
        product3.setDescription("Bicycle");

        System.out.println(product1);


        Triangle tri1 = new Triangle(4.0, 8.1, 10.0);
        System.out.println(tri1);

    }





}