package yuefanke.cn.state;

/**
 * @author:WanChun
 * @date: 2020/3/1-2:58
 * @description: 工作
 */
public class Work {

    private State state;

    private double hour;

    private boolean finish =true;

    public Work() {
        state =new MorningWork();
    }

    public void writeProgram(){
        state.writeProgram(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
