package yuefanke.cn.strategy;

/**
 * @author:WanChun
 * @date:2020/1/19 - 11:50
 * @description: 策略模式
 */
public class Test {
    /**
     * 策略模式定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。
     * 当出现在不同时间，采用不同策略时，可以用策略模式。
     * @param args
     */
    public static void main(String[] args) {
        CashContext cashContext=new CashContext();
        cashContext.ContextInterface("strategyA");
    }
}
