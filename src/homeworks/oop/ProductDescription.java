package homeworks.oop;

//Создайте пользовательский класс для описания товара (предположим, это задел для
//интернет-магазина). В качестве свойств товара можете использовать значение цены,
//описание, вес товара. Создайте пару экземпляров вашего класса и протестируйте их
//работу.

public class ProductDescription {
    private double price;
    private String description;
    private int weight;


    public ProductDescription(double price, String description, int weight) {
        this.price = price;
        this.description = description;
        this.weight = weight;
    }

    public ProductDescription() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
