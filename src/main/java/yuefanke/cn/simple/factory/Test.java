package yuefanke.cn.simple.factory;

/**
 * @author:WanChun
 * @date:2020/1/19 - 10:28
 * @description: 简单工厂类实例调用
 */
public class Test {
    /**
     * 快捷键 psv
     *
     * 计算器功能，利用 继承、封装、多态 。简单工厂 实例。
     */

    public static void main(String[] args) {
       double result= OperationFactory.getOpreation("+").getResult(4,2);
       System.out.println("result:"+result);
    }
}
