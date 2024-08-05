public class Kitty {
    private String name;
    private int hunger;
    private int energy;
    private int happiness;

    public Kitty(String name) {
        this.name = name;
        this.hunger = 50; 
        this.energy = 50; 
        this.happiness = 50; 
    }

    public void eat() {
        if (hunger > 0) {
            hunger -= 10;
            energy += 5;
            happiness += 5;
            System.out.println(name + " comeu e está mais feliz!");
        } else {
            System.out.println(name + " não está com fome.");
        }
    }

    public void sleep() {
        if (energy < 100) {
            energy += 10;
            hunger += 5;
            happiness += 5;
            System.out.println(name + " dormiu e está mais descansada!");
        } else {
            System.out.println(name + " já está cheia de energia.");
        }
    }

    public void play() {
        if (energy > 0 && hunger < 100) {
            energy -= 10;
            hunger += 10;
            happiness += 20;
            System.out.println(name + " brincou e está muito feliz!");
        } else if (hunger >= 100) {
            System.out.println(name + " está com fome demais para brincar.");
        } else {
            System.out.println(name + " está cansada demais para brincar.");
        }
    }

    public void status() {
        System.out.println("\nStatus de " + name + ":");
        System.out.println("Fome: " + hunger + "/100");
        System.out.println("Energia: " + energy + "/100");
        System.out.println("Felicidade: " + happiness + "/100");
    }

    public static void main(String[] args) {
        Kitty kitty = new Kitty("Kitty");

        kitty.status();
        kitty.eat();
        kitty.status();
        kitty.sleep();
        kitty.status();
        kitty.play();
        kitty.status();
    }
}
