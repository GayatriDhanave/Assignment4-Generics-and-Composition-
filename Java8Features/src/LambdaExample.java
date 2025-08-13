public class LambdaExample {
    public static void main (String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run () {
                System.out.println("Run method from traditional way");
            }
        };
        r.run();

        Runnable r1=()->{
            System.out.println("Run method defined using lambda");
        };
        r1.run();

     }
}
