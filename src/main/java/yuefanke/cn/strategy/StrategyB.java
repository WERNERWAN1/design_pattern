package yuefanke.cn.strategy;

/**
 * @author:WanChun
 * @date: 2020/3/1-23:48
 * @description:
 */
public class StrategyB extends CashSuper{
    @Override
    public double acceptCash(){
        //通过策略B 计算收费
        System.out.println("执行策略 StrategyB 免单");
        return 0;
    }
}
