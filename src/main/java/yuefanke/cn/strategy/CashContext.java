package yuefanke.cn.strategy;

/**
 * @author:WanChun
 * @date:2020/1/19 - 14:01
 * @description:
 */
public class CashContext {
    private CashSuper cashSuper;
//
//    public CashContext() {
//        this.cashSuper = cashSuper;
//    }

    //添加工厂模式代码
    public void ContextInterface(String type){
        switch (type){
            case "strategyA":
                this.cashSuper=new StrategyCollection.StrategyA();
                break;
            case "strategyB":
                this.cashSuper=new StrategyCollection.StrategyB();
                break;
                default:
        }
        cashSuper.acceptCash();
    }
}
