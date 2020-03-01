package yuefanke.cn.strategy;

/**
 * @author:WanChun
 * @date: 2020/3/1-23:47
 * @description:
 */
public  class StrategyA extends CashSuper{
    @Override
    public double acceptCash(){
        //通过策略A 计算收费
        System.out.println("执行策略 StrategyA");
        return 0;
    }
}