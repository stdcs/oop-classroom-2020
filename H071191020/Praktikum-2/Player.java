class Player {

    private final String name;
    private int hp;
    private int attackPower;
    private final int defense = 100;
    defense = 10;

    public Player(final String name, final int defense) {
        this.name = name;
        this.defense = defense;
        hp = 100;
    }

    public Player(final String name, final int attackPower, final int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        hp = 100;
    }

    public void setAttackPower(final int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void getDamage(final Player enemy) {
        hp = hp - (enemy.getAttackPower()-defense);
    }
    public void status () {
        System.out.println(name + " Status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
    }
}