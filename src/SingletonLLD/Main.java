package SingletonLLD;

public class Main {

    public static void main(String[] args) {
        //can create how many we want
        SingletonBasic single1 = new SingletonBasic();
        SingletonBasic single2 = new SingletonBasic();
        System.out.println("single 1: " + single1);
        System.out.println("single 1: " + single2);


        LazyIntialization lazy1 = LazyIntialization.getInstance();
        LazyIntialization lazy2 = LazyIntialization.getInstance();
        System.out.println("single 1: " + lazy1);
        System.out.println("single 1: " + lazy2);

        StaticIntialization static1 = StaticIntialization.getInstance();
        StaticIntialization static2 = StaticIntialization.getInstance();
        System.out.println("static1: " + static1);
        System.out.println("static2: " + static2);

        EagerIntialization eager1 = EagerIntialization.getInstance();
        EagerIntialization eager2 = EagerIntialization.getInstance();
        System.out.println("eager1: " + eager1);
        System.out.println("eager2: " + eager2);

        BillPughSingleton bill1 = BillPughSingleton.getInstance();
        BillPughSingleton bill2 = BillPughSingleton.getInstance();
        System.out.println("bill1: " + bill1);
        System.out.println("bill2: " + bill2);
    }

}
