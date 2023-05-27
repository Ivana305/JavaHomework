package JavaProject02;

public class Car {/*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
which should be returning a price of the car. Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and
has its own implementation of calculateSalePrice() method in which returned price is calculated as following: if weight>2000
then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
 if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount */
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length>20){
            return super.calculateSalePrice()*0.95;
    }else {
        return super.calculateSalePrice()*0.9;}
    }
}
class Truck extends  Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight>2000){
        return super.calculateSalePrice()*0.9;
        }else return super.calculateSalePrice()*0.8;

    }
}
class CarTester{
    public static void main(String[] args) {
        Car []cars={new Sedan(10000, "red", 25),new Truck(30000.5, "blue", 1950)};
        for (Car car:cars){
            if (car instanceof Sedan){
                System.out.println("Red Sedan,25 feet long has price: $ "+car.calculateSalePrice());
            }if (car instanceof Truck){
                System.out.println("Blue Truck,weight 1950 lbs has price: $ "+car.calculateSalePrice());

            }
        }
    }
}