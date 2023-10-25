package D7_NoahsArk;

public class NonMammals extends Animal {
    private String animalSound;

    public NonMammals(String name, String animalType, String animalSound) {
        super(name, animalType);
        this.animalSound = animalSound;
    }
    public void layEggs(){
        System.out.println(getName() + " is laying eggs...");
    }
    @Override
    public void reproduce() {
        this.layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println(this.animalSound + "!\n");
    }
}
