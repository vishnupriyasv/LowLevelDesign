package SingletonLLD;

public class BillPughSingleton {

    
    //nested class
    public static class NestedBillPughSingleton{
        private static BillPughSingleton billPughSingleton = new BillPughSingleton();
    } //end of nexted class

    private BillPughSingleton(){}
    public static BillPughSingleton getInstance() {
        return NestedBillPughSingleton.billPughSingleton;
    }

}
