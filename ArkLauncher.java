package D7_NoahsArk;

import java.util.ArrayList;

public class ArkLauncher {
    public void launch(){
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Mammals("dog".toUpperCase(), "Land", "Woof"));
        animalList.add(new NonMammals("snake".toUpperCase(), "Land", "Hiss"));
        animalList.add(new NonMammals("parrot".toUpperCase(), "Flying", "Hello Chirp"));
        animalList.add(new Mammals("dolphin".toUpperCase(), "Aquatic", "Eie-eeee"));
        animalList.add(new NonMammals("beetle".toUpperCase(), "Land", "Gee-gee"));

        for (Animal eachAnimal : animalList) {
            eachAnimal.call();
            eachAnimal.makeSound();
        }
        System.out.println("Rain is stopping...\n");
        for (Animal eachAnimal : animalList ) {
            eachAnimal.reproduce();
        }
    }

    public static void main(String[] args) {
        ArkLauncher launcher = new ArkLauncher();
        launcher.launch();
    }
}
