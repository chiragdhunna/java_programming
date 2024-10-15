enum MyEnum{
    CS("Pablo","BLOCK A"),IT,CIVIL,ECE;

    MyEnum(){
        System.out.println(this.name());
    }

    MyEnum(String nme, String loc){
        System.out.println(nme + " " + loc );
    }

    void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }
}

public class Enums {
    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.ECE;
        System.out.println(myEnum);
        System.out.println(myEnum.ordinal());
        MyEnum dept[] = MyEnum.values();
        for(MyEnum x : dept){
            System.out.println(x);
        }
        myEnum.display();
    }
}
