package yuefanke.cn.templateMethod;

/**
 * @author:WanChun
 * @date: 2020/2/26-16:15
 * @description: 学生B 答题
 */
public class StudentB extends Paper {
    @Override
    public String answerA() {
        return "A";
    }

    @Override
    public String answerB() {
        return "B";
    }

    public static void main(String[] args) {
        System.out.println("学生B 开始作答：");
        StudentB studentB=new StudentB();
        studentB.questionA();
        studentB.questionB();
    }
}
