package lsp.sample1;

public class Ostrich extends Bird {


    public Ostrich() {
        super(false);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Не умеет летать!");
    }

    public void run() {
        System.out.println("Страус бежит!");
    }
}
