package yuefanke.cn.listenner;

/**
 * @author:WanChun
 * @date: 2020/3/1-14:58
 * @description: 监听事件测试
 */
public class Test {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
//        EventListenerA eventListenerA=new EventListenerA();
        eventSource.addListener(new EventListener(){
            @Override
            public void handleEvent(EventObject event) {
                event.doEvent();
                if(event.getSource().equals("closeWindows")){
                    System.out.println("doClose");
                }
            }

        });
        /*
         * 传入openWindows事件，通知listener，事件监听器，
         对open事件感兴趣的listener将会执行
         **/
        eventSource.notifyListenerEvents(new EventObject("openWindows"));
    }
}
