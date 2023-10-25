package D7_NoahsArk;

public class Mammals extends Animal {
    private String animalSound;

    public Mammals(String name, String animalType, String animalSound) {
        super(name, animalType);
        this.animalSound = animalSound;
    }

    public void giveBirth(){
        System.out.println(getName() + " is giving birth...");
    }

    @Override
    public void reproduce() {
        this.giveBirth();
    }

    @Override
    public void makeSound() {
        System.out.println(this.animalSound + "!\n");
    }

}
