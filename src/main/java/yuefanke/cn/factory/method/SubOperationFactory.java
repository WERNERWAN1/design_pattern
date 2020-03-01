package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 16:14
 * @description: 减法工厂类
 */
public class SubOperationFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
