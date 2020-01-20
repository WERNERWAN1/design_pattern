package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 16:05
 * @description: 加法运算
 */
public class AddOperation extends Operation {
    /**
     * 获取结果的操作
     *
     * @param a
     * @param b
     */
    @Override
    public void getResult(double a, double b) {
        System.out.println("加法运算结果为："+(a+b));
    }
}
