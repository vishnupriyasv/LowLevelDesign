package SingletonLLD;

public class EagerIntialization {
    private static EagerIntialization eagerIntialization = new EagerIntialization();

    private EagerIntialization()
    {
        
    }

    public static EagerIntialization getInstance()
    {
        return eagerIntialization;
    }
}
