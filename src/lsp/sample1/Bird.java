package lsp.sample1;

public class Bird {

    private boolean isFlying = true;

    public Bird(boolean isFlying) {
        this.isFlying = isFlying;
    }

    public Bird() {

    }

    public boolean getIsFlying() {
        return isFlying;
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}
