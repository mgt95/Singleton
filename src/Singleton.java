public class Singleton {
    public static void main(String [] args){


        Instance x = Instance.getInstance();

        /*Here we can see a confirmation of creation only one(single) object*/
        x.s = (x.s).toLowerCase();
        Instance t = Instance.getInstance();
        Instance b = Instance.getInstance();

        System.out.println("x = " + x.s);
        System.out.println("t = " + t.s);
        System.out.println("b = " + b.s);



    }

}
