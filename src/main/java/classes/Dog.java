package classes;

public class Dog {
    public int weightInPounds;
    public static String name = "Dog Name";
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

    public static Dog maxDog(Dog d1, Dog d2) {
        if(d1.weightInPounds > d2.weightInPounds) {
            System.out.println("first dog d1 is bigger");
            return d1;
        } else {
            System.out.println("second dog is bigger");
        }

        return d2;
    }
}
