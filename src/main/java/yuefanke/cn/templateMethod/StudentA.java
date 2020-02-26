package yuefanke.cn.templateMethod;

/**
 * @author:WanChun
 * @date: 2020/2/26-16:13
 * @description:
 */
public class StudentA extends Paper {
    @Override
    public String answerA() {
        return "A";
    }

    @Override
    public String answerB() {
        return "B";
    }

    /**
     * 答题输出
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("学生A 开始作答");
        StudentA studentA=new StudentA();
        studentA.questionA();
        studentA.questionB();
    }
}
