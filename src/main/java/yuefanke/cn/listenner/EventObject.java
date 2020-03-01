package yuefanke.cn.listenner;

/**
 * @author:WanChun
 * @date: 2020/3/1-14:49
 * @description: 事件对象
 */
public class EventObject extends java.util.EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventObject(Object source) {
        super(source);
    }


    public void doEvent(){
        System.out.println("通知一个事件源："+this.getSource());
    }
}
