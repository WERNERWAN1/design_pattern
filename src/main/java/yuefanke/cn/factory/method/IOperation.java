package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 16:14
 * @description:
 */
public interface IOperation {
    /**
     * 创建操作类，顶层接口
     * @return
     */
    Operation createOperation();
}
