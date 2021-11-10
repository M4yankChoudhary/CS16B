package classes;

public class Dog {
    public int weightInPounds;
    public Dog(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public void makeNoise() {
        if(weightInPounds <= 10) {
            System.out.println("yip!");
        } else if(weightInPounds <= 30) {
            System.out.println("bark!!");
        } else {
            System.out.println("wooooo!!");
        }
    }
}
