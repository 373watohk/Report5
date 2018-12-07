package jp.ac.uryukyu.ie.e185720;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name プレイヤー名
     * @param hitPoint プレイヤーのHP
     * @param attack プレイヤーの攻撃力
     */
    public LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead() {

        return dead;
    }

    public String getName() {

        return name;
    }


    /**
     * メソッド。攻撃側が死んでいたら何もせず、生きていたら攻撃をする。
     * @param opponent　攻撃対象名
     */
    public void attack(LivingThing opponent) {
        if(dead == true) {

        }else {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    public int getHitPoint() {

        return hitPoint;
    }


    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int damageVal(int damage) {
        hitPoint -= damage;
        return hitPoint;
    }
}
