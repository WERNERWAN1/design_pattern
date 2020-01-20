package yuefanke.cn.decorator;

/**
 * @author:WanChun
 * @date:2020/1/20 - 11:31
 * @description: 多种服饰的总类
 */
public class MultipleFinery {

    public static class Tshirts extends Finery {
        @Override
        public void show() {
            super.show();
            System.out.println("穿 T-shirt");

        }
    }

    public static class BigTrouser extends Finery {
        @Override
        public void show() {
            super.show();
            System.out.println("穿 垮裤 ");

        }
    }

    public static class Glass extends Finery {
        @Override
        public void show() {
            super.show();
            System.out.println("带 眼镜");

        }
    }
}
