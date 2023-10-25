package D7_NoahsArk;

import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private String animalType;

    public Animal(String name, String animalType){
        this.name = name;
        this.animalType = animalType;
    };

    public abstract void reproduce();
    public abstract void makeSound();

    public void call() {
        if (this.animalType.equals("Flying")) {
            System.out.println(this.name + " now flying, will come later when tired...");
        } else if (this.animalType.equals("Aquatic")) {
            System.out.println(this.name + " will not come...");
        } else {
            System.out.println(this.name + " coming...");
        }
    }

    public String getName(){
        return this.name;
    }

    public String getType() {
        return this.animalType;
    }

}
