public class Rabbit extends Animal implements Edible {
    private int jumpHeight;

    Rabbit(String name, int age, int jumpHeight) {
        super(name, 4, age);
        this.jumpHeight = jumpHeight;
    }

    int getJumpHeight() {
        return jumpHeight;
    }

    void introduce() {
        super.introduce();
        System.out.println(jumpHeight);
    }

    @Override
    public void taste() {
        System.out.println("노릇노릇");
    }

    @Override
    public void kill() {
        super.kill();
    }
}