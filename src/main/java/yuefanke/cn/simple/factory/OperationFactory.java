package yuefanke.cn.simple.factory;

/**
 * @author:WanChun
 * @date:2020/1/19 - 10:08
 * @description: 操作（运算）-简单工厂类
 */
public class OperationFactory {

    /**
     * 获取操作类
     * @param action
     * @return
     */
    public static Operation getOpreation(String action) {
        switch (action) {
            case "+":
                return new MultipleOperation.OperationAdd();
            case "-":
                return new MultipleOperation.OperationSub();
            default:
                return null;
        }
    }
}
