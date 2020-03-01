package yuefanke.cn.listenner;



/**
 * @author:WanChun
 * @date: 2020/3/1-14:47
 * @description: 监听器接口
 */
public interface EventListener extends java.util.EventListener {
    /**
     * 时间处理
     * @param object 事件
     */
    void handleEvent(EventObject object);
}
