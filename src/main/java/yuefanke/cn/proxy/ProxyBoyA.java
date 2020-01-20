package yuefanke.cn.proxy;

/**
 * @author:WanChun
 * @date:2020/1/20 - 14:47
 * @description: BoyB 的代理对象
 */
public class ProxyBoyA implements GiveGift {

    public BoyB boyB;

    public ProxyBoyA(Girl girl) {
        this.boyB = new BoyB(girl);
    }

    /**
     * 送花
     */
    @Override
    public void giveFlower() {
        boyB.giveFlower();
    }

    /**
     * 传递信息
     */
    @Override
    public void giveMessage() {
        boyB.giveMessage();
    }

    /**
     * 送香水
     */
    @Override
    public void givePerfume() {
        boyB.givePerfume();
    }
}
