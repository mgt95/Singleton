public class Instance {

    static Instance instance = null;

    static String s;

    private Instance(){

    s = "GXOIKL";

    }

    public static Instance getInstance(){

        if(instance == null){
            instance = new Instance();

        }

        return instance;
    }
}
