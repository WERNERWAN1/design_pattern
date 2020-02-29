package yuefanke.cn.adapter;

/**
 * @author:WanChun
 * @date: 2020/3/1-3:25
 * @description: 适配器
 */
public class Adapter extends Target{

    private Adaptee adaptee=new Adaptee();

    @Override
    public void request(){
        adaptee.specificRequest();
    }
}
