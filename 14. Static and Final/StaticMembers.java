class Honda{
    static int price = 4300000;

    int rpm;
    int avg;

    static double onRoadPrice(String city){
        switch (city)
        {
            case "MP":
                return 4300000;
            case "AP":
                return 4600000;
            case "UP":
                return 4230000;
            default:
                return 4300000;
        }
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        System.out.println(Honda.onRoadPrice("UP"));;
    }
}
