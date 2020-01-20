package yuefanke.cn.factory.method;

/**
 * @author:WanChun
 * @date:2020/1/20 - 16:03
 * @description: 运算
 */
public class Operation {

    private double a;
    private double b;
    /**
     * 获取结果的操作
     */
   public void getResult(double a,double b){
       System.out.println("父类运算结果方法调用");
   }
}
