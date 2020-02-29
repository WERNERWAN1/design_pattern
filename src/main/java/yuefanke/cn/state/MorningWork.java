package yuefanke.cn.state;

/**
 * @author:WanChun
 * @date: 2020/3/1-3:01
 * @description:
 */
public class MorningWork extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<12){
            System.out.println("当前时间："+w.getHour() +"上午工作状态不错");
        }else{
            w.setState(new AfternoonWork());
            w.writeProgram();
        }
    }
}
