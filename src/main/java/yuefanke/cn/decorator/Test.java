package yuefanke.cn.decorator;

/**
 * @author:WanChun
 * @date:2020/1/20 - 11:23
 * @description: 装饰模式
 */
public class Test {

    /**
     * 装饰模式的调用，通过 人穿服装事例演示
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建对象人
        Person person = new Person("Werner");
        //创建装饰对象 tshirts
        MultipleFinery.Tshirts tshirts = new MultipleFinery.Tshirts();
        //创建装饰对象 bigTrouser
        MultipleFinery.BigTrouser bigTrouser = new MultipleFinery.BigTrouser();
        //创建装饰对象 glass
        MultipleFinery.Glass glass=new MultipleFinery.Glass();
        //将人放入装饰对象中
        tshirts.Decorate(person);
        //将装饰后的人放入下一个装饰对象中
        bigTrouser.Decorate(tshirts);
        //将装饰后的人放入下一个装饰对象中
        glass.Decorate(bigTrouser);
        //展示出来。先调用上级装饰，构成穿衣顺序
        glass.show();
    }
}
