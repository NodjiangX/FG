package wang.feiga.book.dto;

import wang.feiga.book.enums.AppointStateEnum;
import wang.feiga.book.test.entity.Appointment;

/**
 * 内容概要：封装预约执行后的结果
 * 作 者： 姜昊
 * 版本号： V1.0
 * 完成时间： 2018-01-31 16:03
 **/

public class AppointExecution {
    private long bookId;  //图书ID
    private int state;   //秒杀预约结果状态
    private String stateInfo;  //状态标识
    private Appointment appointment; //预约成功对象

    public AppointExecution() {

    }

    /*预约失败构造函数*/
    public AppointExecution(long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /*预约成功构造器*/
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
