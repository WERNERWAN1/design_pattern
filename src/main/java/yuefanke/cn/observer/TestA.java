package yuefanke.cn.observer;

/**
 * @author:WanChun
 * @date: 2020/2/26-20:01
 * @description: 观察者模式 演示类
 */
public class TestA {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver("张先生", subject));
        subject.addObserver(new ConcreteObserver("李先生", subject));
        subject.addObserver(new ConcreteObserver("刘先生", subject));

        //更改主题状态
        subject.setSubjectState("close");
        //发布通知
        subject.notifyMessage();

    }
}
