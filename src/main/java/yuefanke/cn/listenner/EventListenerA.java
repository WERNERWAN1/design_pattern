package yuefanke.cn.listenner;

/**
 * @author:WanChun
 * @date: 2020/3/1-14:59
 * @description: 事件监听对象
 */
public class EventListenerA implements EventListener {
    /**
     * 时间处理
     *
     * @param object 事件
     */
    @Override
    public void handleEvent(EventObject object) {
        System.out.println("监听到动向");
    }
}
