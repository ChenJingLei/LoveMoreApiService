package app.models;

/**
 * Created by cjl20 on 2015/11/25.
 */
public class LoginStatus {

    User loginer;

    /*
    status:1-登陆成功、0-密码错误、-1账户不存在
     */
    int status = 0;

//    String token;


    public User getLoginer() {
        return loginer;
    }

    public void setLoginer(User loginer) {
        this.loginer = loginer;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
