class Animal {
    private String name;
    private int legs;
    private int age;
    private static int count = 0;

    Animal(String name, int legs, int age) {
        this.name = name;
        this.legs = legs;
        this.age = age;
        count++;
    }

    void kill() {
        count--;
    }

    static int getCount() {
        return count;
    }

    String getName() {
        return name;
    }

    int getLegs() {
        return legs;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void introduce() {
        System.out.println(name);
        System.out.println(legs);
        System.out.println(age);
    }
}