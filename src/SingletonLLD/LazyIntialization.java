package SingletonLLD;
//making the instance as static
//there is eager intialization you give the instance creation at the line 5 itself, just return exisiting instance
public class LazyIntialization {
    private static LazyIntialization lazyIntialization;

    private LazyIntialization()
    {
        
    }

    public static LazyIntialization getInstance()
    {
        if(lazyIntialization == null)
        {
            return lazyIntialization = new LazyIntialization();
        }

        return lazyIntialization;
    }
}
