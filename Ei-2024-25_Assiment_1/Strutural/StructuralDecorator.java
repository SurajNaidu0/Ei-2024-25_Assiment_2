//Here I have demonstrated Structural Decorator pattern using a ikea example
// Image is attached with it please refer that to see the implemented logic
abstract class Ikea{
    String selected = "None";
    public String getDescription(){
        return selected;
    }
    public abstract int getCost();
}
class HotDrink extends Ikea{
    public HotDrink(){
        selected = "HotDrink";
    }
    @Override
    public int getCost(){
        return 100;
    }
}

class Beverage extends Ikea{
    public Beverage(){
        selected = "Bevrage";
    }
    @Override
    public int getCost(){
        return 80;
    }
}

class Milk extends HotDrink{
    HotDrink drink;
    public Milk(HotDrink drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription() + " Milk";
    }
    @Override
    public int getCost(){
        return drink.getCost();
    }
}

class Tea extends HotDrink{
    HotDrink drink;
    public Tea(HotDrink drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription()+ " Tea";
    }
    @Override
    public int getCost(){
        return drink.getCost() + 20;
    }
}

class Coffee extends HotDrink{
    HotDrink drink;
    public Coffee(HotDrink drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription()+ " Coffee";
    }
    @Override
    public int getCost(){
        return drink.getCost() + 40;
    }
}

class lemonJuice extends Beverage{
    Beverage drink ;
    public lemonJuice(Beverage drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription() + " lemonJuice";
    }
    @Override
    public int getCost(){
        return drink.getCost();
    }
}
class cola extends Beverage{
    Beverage drink ;
    public cola(Beverage drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription() + " cola";
    }
    @Override
    public int getCost(){
        return drink.getCost() + 20;
    }
}
class fruitJuice extends Beverage{
    Beverage drink ;
    public fruitJuice(Beverage drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription() + " fruitJuice";
    }
    @Override
    public int getCost(){
        return drink.getCost() + 20;
    }
}


public class StructuralDecorator {
    public static void main(String[] args){
        Ikea ikeaBev = new Beverage();
        System.out.println(ikeaBev.getCost());
        System.out.println(ikeaBev.getDescription());

        Ikea ikeaHot = new HotDrink();

        Ikea ikeaHot1 = new Tea((HotDrink) ikeaHot);
        System.out.println(ikeaHot1.getCost());
        System.out.println(ikeaHot1.getDescription());

        Ikea ikeaHot2 = new Coffee((HotDrink) ikeaHot);
        System.out.println(ikeaHot2.getCost());
        System.out.println(ikeaHot2.getDescription());
    }
}
