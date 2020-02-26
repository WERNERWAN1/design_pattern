package yuefanke.cn.templateMethod;

/**
 * @author:WanChun
 * @date: 2020/2/26-16:05
 * @description: 试卷类
 */
public abstract class Paper {

    public void questionA(){
        System.out.println("1.请问 1+1 等于多少 A.1  B.2 C.3 D.4 答案："+answerA());

    }

    public abstract String answerA();

    public void questionB(){
        System.out.println("2.请问 1*1 等于多少 A.1 B.2 C.3 D.4  答案："+answerB());
    }

    public abstract String answerB();
}
