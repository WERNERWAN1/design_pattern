package yuefanke.cn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:WanChun
 * @date: 2020/2/26-18:59
 * @description: 主题/抽象通知者
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 减少观察者
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyMessage() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
