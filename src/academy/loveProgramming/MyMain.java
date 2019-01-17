package academy.loveProgramming;

/**
 * Created by balajakka on 11/01/2019.
 */
public class MyMain {
    public static void main(String[] args) {
        //GermanShep germShep = new GermanShep();
        Dog germShep = new GermanShep();
        System.out.println("************************************");
        Cat cat1 = new Cat();
        System.out.println(germShep.DEFAULT_TAIL_LENGTH);
        System.out.println("**************************");
        System.out.println("Tail length of GermanSheperd is" +germShep.getTailLength());

    }
}
