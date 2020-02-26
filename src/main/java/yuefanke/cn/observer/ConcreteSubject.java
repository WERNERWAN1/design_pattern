package yuefanke.cn.observer;

/**
 * @author:WanChun
 * @date: 2020/2/26-19:05
 * @description: 具体主体/具体通知者
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public ConcreteSubject(String subjectState) {
        this.subjectState = subjectState;
    }
}
