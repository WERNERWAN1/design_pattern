package yuefanke.cn.strategy;

/**
 * @author:WanChun
 * @date:2020/1/19 - 14:05
 * @description:
 */
public class StrategyCollection {

    public static class StrategyA extends CashSuper{
        @Override
        public double acceptCash(){
            //通过策略A 计算收费
            System.out.println("执行策略 StrategyA");
            return 0;
        }
    }

    public static class StrategyB extends CashSuper{
        @Override
        public double acceptCash(){
            //通过策略B 计算收费
            System.out.println("执行策略 StrategyB");
            return 0;
        }
    }
}
