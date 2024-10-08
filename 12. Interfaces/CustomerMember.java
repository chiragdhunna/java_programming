interface Member{
    void callBack();
}

class Store{
    Member member[] = new Member[100];
    int count = 0;

    void register(Member m){
        member[count++] = m;
    }

    void inviteSale(){
        for(int i=0; i<count; i++){
            member[i].callBack();
        }
    }
}

class Customer implements Member{
    String name;

    Customer(String name){
        this.name = name;
    }

    @Override
    public void callBack(){
        System.out.println("OK, I will visit " + name);
    }
}

public class CustomerMember {
    public static void main(String[] args) {
        Store store = new Store();
        Customer noraFatehi = new Customer("Nora Fatehi");
        Customer miaMalkova = new Customer("Mia Malkova");
        Customer annJoy = new Customer("Ann Joy");
        Customer leahGotti = new Customer("Leah Gotti");
        store.register(noraFatehi);
        store.register(miaMalkova);
        store.register(annJoy);
        store.register(leahGotti);
        store.inviteSale();
    }
}
