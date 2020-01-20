package yuefanke.cn.proxy;

/**
 * @author:WanChun
 * @date:2020/1/20 - 14:47
 * @description:
 */
public class BoyB implements GiveGift {

    private Girl girl;

    public BoyB(Girl mm) {
        this.girl = mm;
    }

    /**
     * 送花
     */
    @Override
    public void giveFlower() {
        System.out.println(girl.getName()+":"+"送你的白玫瑰");
    }

    /**
     * 传递信息
     */
    @Override
    public void giveMessage() {
        System.out.println(girl.getName()+":"+"送你的信");
    }

    /**
     * 送香水
     */
    @Override
    public void givePerfume() {
        System.out.println(girl.getName()+":"+"送你的香水");
    }
}
