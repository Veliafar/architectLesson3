package lsp.sample1;

public class Program {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Ostrich ostrich = new Ostrich();

        Bird[] birds = new Bird[] {bird, bird2, bird3, ostrich};

        flyBirds(birds);
    }

    public static void flyBirds(Bird[] birds) {
        for (Bird bird : birds) {
            if (bird.getIsFlying()) {
                bird.fly();
            }
        }
    }
}
