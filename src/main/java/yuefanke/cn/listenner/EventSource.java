package yuefanke.cn.listenner;

import java.util.Vector;

/**
 * @author:WanChun
 * @date: 2020/3/1-14:51
 * @description: 事件源
 */
public class EventSource {
    /**
     *  监听器列表
     */
    private Vector<EventListener> listenners=new Vector<>();

    /**
     * 注册监听器
     */
    public void addListener(EventListener eventListener){
        listenners.add(eventListener);
    }
    /**
     * 撤销注册
     */
    public void removeListener(EventListener eventListener){
        listenners.remove(eventListener);
    }

    /**
     * 接受外部事件
     * @param event
     */
    public void notifyListenerEvents(EventObject event){
        for(EventListener eventListener:listenners){
            eventListener.handleEvent(event);
        }
    }
}
