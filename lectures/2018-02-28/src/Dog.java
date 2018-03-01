public class Dog extends Animal implements Barkable, Edible {
    private boolean loyal;

    Dog(String name, int age, boolean loyal) {
        super(name, 4, age);
        this.loyal = loyal;

    }

    boolean isLoyal() {
        return loyal;
    }

    void introduce() {
        super.introduce();
        System.out.println(loyal);
    }

    @Override
    public void bark() {
        System.out.println("왈왈");
    }

    @Override
    public void taste() {
        System.out.println("쫄깃쫄깃");
    }

    @Override
    public void kill() {
        super.kill();
    }
}