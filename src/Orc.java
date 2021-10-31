public class Orc implements Playable{

    @Override
    public String move() {
        return "run";
    }

    @Override
    public String attack() {
        return "ax blow";
    }

    @Override
    public String defence() {
        return "block";
    }

    public static void main(String[] args) {
        Orc orc = new Orc();

        System.out.println(orc.move());
        System.out.println(orc.attack());
        System.out.println(orc.defence());
    }
}
