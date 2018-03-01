public class Demo {
    static void makeBark(Barkable animal) {
        animal.bark();
    }

    static void eat(Edible animal) {
        animal.kill();
        animal.taste();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("sugju", 4, false);
        Rabbit rabbit = new Rabbit("Yuzuru", 1, 900000);
        Tiger tiger = new Tiger("Julie", 0, true);

        dog.introduce();
        System.out.println();

        rabbit.introduce();
        System.out.println();

        tiger.introduce();
        System.out.println();

        dog.kill();
        System.out.println(Animal.getCount());
        System.out.println();

        makeBark(dog);
        makeBark(tiger);
        eat(dog);
        eat(rabbit);
    }
}