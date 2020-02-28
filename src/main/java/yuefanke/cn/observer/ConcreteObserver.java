package yuefanke.cn.observer;

/**
 * @author:WanChun
 * @date: 2020/2/26-20:27
 * @description: 具体观察者
 */
public class ConcreteObserver extends  Observer {

    private String name;

    /**
     * 用于接收主题的状态
     */
    private String observerState;

    private ConcreteSubject concreteSubject;

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
    observerState=concreteSubject.getSubjectState();
        System.out.println("观察者"+name+"的状态是"+observerState);
    }
}
