class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine instance = null;

    private CoffeeMachine(){
        this.coffeeQty = 1;
        this.milkQty = 1;
        this.waterQty = 1;
        this.sugarQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }

    public void fillSugar(float qty){
        sugarQty = qty;
    }

    public float getCoffee(){
        return 0.23f;
    }

    static CoffeeMachine getInstance(){
        if(instance==null){
            instance = new CoffeeMachine();
            return instance;
        }
        return instance;

    }
}

public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        System.out.println(coffeeMachine.getCoffee()); 
    }
}
