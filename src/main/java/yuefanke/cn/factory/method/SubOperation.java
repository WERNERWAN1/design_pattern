package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 16:07
 * @description:
 */
public class SubOperation extends Operation {
    /**
     * 获取结果的操作
     *
     * @param a
     * @param b
     */
    @Override
    public void getResult(double a, double b) {
        System.out.println("减法运算的结果为："+(a-b));
    }
}
