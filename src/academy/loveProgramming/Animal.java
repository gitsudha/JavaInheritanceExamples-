package academy.loveProgramming;

/**
 * Created by balajakka on 11/01/2019.
 */
public class Animal  implements AnimalInterface{
    public Animal(){
        System.out.println("I am in Animal Class");
    }

    @Override
    public int getTailLength() {
        return 5;
    }
}
