package yuefanke.cn.decorator;

/**
 * @author:WanChun
 * @date:2020/1/20 - 11:28
 * @description: 服饰公共类
 */
public class Finery extends Person {

    protected  Person component;

    /**
     * 装扮
     */
    public void Decorate(Person person){
        this.component=person;
    }

    @Override
    public void show() {
        if(null!=component){
            component.show();
        }
    }
}
