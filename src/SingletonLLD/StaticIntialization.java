package SingletonLLD;

public class StaticIntialization {
    private static StaticIntialization staticIntialization;

    private StaticIntialization(){

    }

    static {
        try {
            staticIntialization = new StaticIntialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticIntialization getInstance()
    {
        return staticIntialization;
    }
}
