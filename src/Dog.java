public class Dog {
    String name, breed;
    int age;
    boolean goodBoy;

    public Dog(String name, String breed, int age, boolean goodBoy)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.goodBoy = goodBoy;
    }

    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Ranger", "Lab Mix", 1, true);

        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);
        System.out.println("Good Boy: " + dog1.goodBoy);
    }
}
