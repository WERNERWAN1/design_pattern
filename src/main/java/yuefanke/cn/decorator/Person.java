package yuefanke.cn.decorator;

/**
 * @author:WanChun
 * @date:2020/1/20 - 11:26
 * @description:
 */
public class Person {

    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name=name;
    }

    public void show(){
        System.out.println("装扮者："+name);
    }
}
