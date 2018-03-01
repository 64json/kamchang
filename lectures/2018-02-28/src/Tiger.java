public class Tiger extends Animal implements Barkable {
    private boolean brave;

    Tiger(String name, int age, boolean brave) {
        super(name, 4, age);
        this.brave = brave;
    }

    boolean isBrave() {
        return brave;
    }

    void introduce() {
        super.introduce();
        System.out.println(brave);
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}