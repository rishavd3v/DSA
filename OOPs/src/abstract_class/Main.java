package abstract_class;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.carrer();
        son.partner();

        Daughter daughter = new Daughter();
        daughter.carrer();
        daughter.partner();
    }
}
