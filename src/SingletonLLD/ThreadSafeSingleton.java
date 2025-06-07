package SingletonLLD;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }


    //can make entire method synchronized but it costs more so lets not try to use it
    // public static synchronized  LazyIntialization getInstance()
    // {
    //     if(lazyIntialization == null)
    //     {
    //         return lazyIntialization = new LazyIntialization();
    //     }

    //     return lazyIntialization;
    // }
}
