package yuefanke.cn.observer;

/**
 * @author:WanChun
 * @date: 2020/2/26-19:05
 * @description: 具体主题/具体通知者
 */
public class ConcreteSubject extends Subject {

    /**
     * 主题状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

}
