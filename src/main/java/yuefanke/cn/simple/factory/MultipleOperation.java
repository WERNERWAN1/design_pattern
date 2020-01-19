package yuefanke.cn.simple.factory;

/**
 * @author:WanChun
 * @date:2020/1/19 - 10:11
 * @description:
 */
public class MultipleOperation {

    /**
     * 加法运算类
     */
    static class OperationAdd extends Operation{


        /**
         * 获取计算结果
         *
         * @param a      参数a
         * @param b      参数b
         * @return 返回结果
         */
        @Override
        public double getResult(double a, double b) {
            double result=a+b;
            return result;
        }
    }

    /**
     * 减法运算类
     */
    static class  OperationSub extends Operation{

        /**
         * 获取计算结果
         *
         * @param a      参数a
         * @param b      参数b
         * @return 返回结果
         */
        @Override
        public double getResult(double a, double b) {
            double result=a-b;
            return result;
        }
    }


}
