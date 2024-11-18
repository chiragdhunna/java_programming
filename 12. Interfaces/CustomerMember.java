interface Member {
    void callBack();
}

class StoreCM {
    Member member[] = new Member[100];
    int count = 0;

    void register(Member m) {
        member[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            member[i].callBack();
        }
    }
}

class CustomerCM implements Member {
    String name;

    CustomerCM(String name) {
        this.name = name;
    }

    @Override
    public void callBack() {
        System.out.println("OK, I will visit " + name);
    }
}

public class CustomerMember {
    public static void main(String[] args) {
        StoreCM store = new StoreCM();
        CustomerCM noraFatehi = new CustomerCM("Nora Fatehi");
        CustomerCM miaMalkova = new CustomerCM("Mia Malkova");
        CustomerCM annJoy = new CustomerCM("Ann Joy");
        CustomerCM leahGotti = new CustomerCM("Leah Gotti");
        store.register(noraFatehi);
        store.register(miaMalkova);
        store.register(annJoy);
        store.register(leahGotti);
        store.inviteSale();
    }
}
