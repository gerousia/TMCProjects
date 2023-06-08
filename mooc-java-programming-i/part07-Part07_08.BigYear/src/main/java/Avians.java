import java.util.ArrayList;

public class Avians {
    private ArrayList<Bird> birds;

    public Avians() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void observeBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.observe();
            }
        }
    }

    public void printBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }

    public void printAllBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public boolean containsBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}
