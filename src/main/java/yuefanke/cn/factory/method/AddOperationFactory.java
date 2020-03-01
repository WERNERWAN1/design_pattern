package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 16:17
 * @description: 加法工厂类
 */
public class AddOperationFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
