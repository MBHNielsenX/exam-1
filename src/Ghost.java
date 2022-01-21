public class Ghost extends Enemy{

    public Ghost(int health, String name) {
        super(health = 10, name);

    }
    @Override
    public void getAttacked() {
        if (getHealth() > 0) {
            super.getAttacked();
        } else {
            System.out.println("The ghost is dead");
        }
    }
}
