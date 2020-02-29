package yuefanke.cn.state;

/**
 * @author:WanChun
 * @date: 2020/3/1-3:04
 * @description:
 */
public class AfternoonWork extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<18){
            System.out.println("当前时间："+w.getHour() +"下午工作状态不太好了");
        }
    }
}
