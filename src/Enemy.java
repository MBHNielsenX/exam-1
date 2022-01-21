public abstract class Enemy {
    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void getAttacked() {
        this.health += -1;
    }
}
