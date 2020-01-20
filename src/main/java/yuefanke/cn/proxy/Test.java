package yuefanke.cn.proxy;

/**
 * @author:WanChun
 * @date:2020/1/20 - 14:46
 * @description: 代理模式。通过代理送礼物。
 */
public class Test {

    public static void main(String[] args) {
        //有一个女孩，名字叫铁锤
        Girl girl=new Girl("铁锤");
        // 有个快递员男孩 A
        ProxyBoyA daili=new ProxyBoyA(girl);
        // A 开始送礼物 ，神秘人B 一直没有出现在 铁锤面前
        daili.giveMessage();
        daili.giveFlower();
        daili.givePerfume();
    }

}
