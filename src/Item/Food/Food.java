package Item.Food;

public abstract class Food implements IConsumable {
    private double power;
    private Apple apple = new Apple(5);
    private Bread bread = new Bread(10);
    private Chicken chicken = new Chicken(25);
    private Pizza pizza = new Pizza(50);
    private Vegetables vegetables = new Vegetables(1);

    public double getPower() {
        return power;
    }

    public Food(double power) {
        this.power = power;
        this.apple = apple;
        this.bread = bread;
        this.chicken = chicken;
        this.pizza = pizza;
        this.vegetables = vegetables;
    }


}
