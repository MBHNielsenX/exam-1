public class Zombie extends Enemy{

    public Zombie(int health, String name) {
        super(health = 12, name);

    }


    @Override
    public void getAttacked() {
        if (getHealth() > 0) {
            super.getAttacked();
        } else {
            System.out.println("The zombie is dead");
        }


    }
}
